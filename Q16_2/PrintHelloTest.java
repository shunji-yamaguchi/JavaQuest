package Q16_2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintHelloTest {
    LabelPrinter lp;
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setup() {
        lp = new LabelPrinter("テスト");
        System.setOut(new PrintStream(output));
    }

    @After
    public void teardown() {
        System.setOut(null);
        Thread.interrupted();
    }

    @Test
    public void ラベルに文字が入力されているかのテスト() {
        assertEquals(lp.label, "テスト");
    }

    @Test
    public void ラベルの文字が出力されているかのテスト() throws InterruptedException {
        lp.start();
        Thread.sleep(100); //スレッドが実行されるまで待つ
        assertEquals("テスト" + System.lineSeparator(), output.toString());
    }

    @Test(expected = InterruptedException.class)
    public void スリープに割り込んでみる() throws InterruptedException {
        lp.start();
        Thread.sleep(100);
        lp.interrupt();
    }

    @Test
    public void mainがスレッドをスタートしたかどうか() throws InterruptedException {
        PrintHello.main(null);
        Thread.sleep(100);
        assertEquals("こんにちは!" + System.lineSeparator(), output.toString());
    }

}

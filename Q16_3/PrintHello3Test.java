package Q16_3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintHello3Test {
    LabelPrinter lp;
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setup() {
        lp = new LabelPrinter("test");
        System.setOut(new PrintStream(output));
    }

    @After
    public void teardown() throws InterruptedException {
        System.setOut(null);
        Thread.interrupted();
    }

    @Test
    public void labelへの入力確認() {
        assertEquals("test", lp.label);
    }

    @Test
    public void labelの出力確認() throws InterruptedException {
        lp.start();
        Thread.sleep(100);
        assertEquals("test" + System.lineSeparator(), output.toString());
    }

    @Test(expected = InterruptedException.class)
    public void 割り込みしてみる() throws InterruptedException {
        lp.start();
        Thread.sleep(100);
        lp.interrupt();
    }

    @Test
    public void メインの動作確認() throws InterruptedException {
        String ls = System.lineSeparator();
        PrintHello3.main(null);
        Thread.sleep(100);
        assertThat(output.toString(),
                allOf(containsString("おはよう!" + ls),
                        containsString("こんにちは!" + ls),
                        containsString("こんばんは!" + ls)));
    }
}

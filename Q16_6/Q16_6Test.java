package Q16_6;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q16_6Test {
    ByteArrayOutputStream output;

    @Before
    public void setup() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @After
    public void teardown() {
        output = null;
        System.setOut(null);
    }

    @Test
    public void PrintEveryThreeSecondの実行確認() throws InterruptedException {
        PrintEveryThreeSecond p3 = new PrintEveryThreeSecond();
        p3.start();
        p3.join();
        assertThat(output.toString(), is("***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()
                + "***" + System.lineSeparator()));
    }

    @Test(expected = InterruptedException.class)
    public void PrintEveryThreeSecondに割り込む() {
        PrintEveryThreeSecond p3 = new PrintEveryThreeSecond();
        p3.start();
        p3.interrupt();
    }

    @Test
    public void PrintEveryFiveSecondの実行確認() throws InterruptedException {
        PrintEveryFiveSecond p5 = new PrintEveryFiveSecond();
        p5.start();
        p5.join();
        assertThat(output.toString(), is("=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()
                + "=====" + System.lineSeparator()));
    }

    @Test(expected = InterruptedException.class)
    public void PrintEveryFiveSecondに割り込む() {
        PrintEveryFiveSecond p5 = new PrintEveryFiveSecond();
        p5.start();
        p5.interrupt();
    }

    @Test
    public void mainの実行確認() {
        Q16_6.main(null);

        assertThat(output.toString(), allOf(startsWith("***"), endsWith("=====" + System.lineSeparator())));

    }
}

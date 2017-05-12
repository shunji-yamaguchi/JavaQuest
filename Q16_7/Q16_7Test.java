package Q16_7;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q16_7Test {
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
        Thread thp3 = new Thread(p3);
        thp3.start();
        thp3.join();
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
    public void PrintEveryThreeSecondに割り込む() throws InterruptedException {
        PrintEveryThreeSecond p3 = new PrintEveryThreeSecond();
        Thread thp3 = new Thread(p3);
        thp3.start();
        thp3.interrupt();
        thp3.join();
    }

    @Test
    public void PrintEveryFiveSecondの実行確認() throws InterruptedException {
        PrintEveryFiveSecond p5 = new PrintEveryFiveSecond();
        Thread thp5 = new Thread(p5);
        thp5.start();
        thp5.join();
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
    public void PrintEveryFiveSecondに割り込む() throws InterruptedException {
        PrintEveryFiveSecond p5 = new PrintEveryFiveSecond();
        Thread thp5 = new Thread(p5);
        thp5.start();
        thp5.interrupt();
        thp5.join();
    }

    @Test
    public void mainの実行確認() {
        Q16_7.main(null);

        assertThat(output.toString(), allOf(startsWith("***"), endsWith("=====" + System.lineSeparator())));

    }
}

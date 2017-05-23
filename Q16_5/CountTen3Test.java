package Q16_5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountTen3Test {
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void teardown() {
        System.setOut(null);
        Thread.interrupted();

    }

    @Test
    public void スレッドが動いてるか確認() throws InterruptedException {
        CountTen3 ct = new CountTen3();
        ct.start();
        ct.join();
        assertThat(output.toString(), endsWith(":i9" + System.lineSeparator()));
    }

    @Test
    public void mainがスレッドを動かしたか確認() throws InterruptedException {
        CountTen3.main(null);
        CountTen3 ct = new CountTen3();
        ct.join();
        assertThat(output.toString(), containsString("Thread1"));
        assertThat(output.toString(), containsString("Thread2"));
        assertThat(output.toString(), containsString("Thread3"));

    }

    @Test
    public void main自身が動いてるか確認() throws InterruptedException {
        CountTen3.main(null);
        CountTen3 ct3 = new CountTen3();
        ct3.join();
        assertThat(output.toString(), containsString("main]:i9"));
    }

}

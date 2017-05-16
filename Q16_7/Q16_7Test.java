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
    public void mainの実行確認() {
        Q16_7.main(null);

        assertThat(output.toString(), allOf(startsWith("***"), endsWith("=====" + System.lineSeparator())));

    }
}

package Q18_2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindFile1Test {

    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void teardown() {
        System.setOut(null);
    }

    @Test
    public void testを検索するとtestと表示される() {
        String[] args = new String[2];
        args[0] = "test";
        args[1] = "sample.txt";
        String ls = System.lineSeparator();
        FindFile1.main(args);
        assertThat(output.toString(), is("test" + ls));
    }

    @Test
    public void 存在しないファイルだった場合はfilenameが見つかりませんと表示される() {
        String[] args = new String[2];
        args[0] = "test";
        args[1] = "sample.java";
        String ls = System.lineSeparator();
        FindFile1.main(args);
        assertThat(output.toString(), is("sample.javaが見つかりません。" + ls));
    }

    @Test(expected = NullPointerException.class)
    public void 文字列にnullを入れた場合はNullPointerExceptionが返ってくる() {
        String[] args = new String[2];
        args[0] = null;
        args[1] = "sample.txt";
        FindFile1.main(args);
    }

}

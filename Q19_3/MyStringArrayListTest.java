package Q19_3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringArrayListTest {

    MyStringArrayList testList;
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setup() {
        testList = new MyStringArrayList();
        System.setOut(new PrintStream(output));
    }

    @After
    public void teardown() {
        testList = null;
    }

    @Test
    public void コンストラクタ動作のあとはNull以外であること() {
        assertNotNull(testList);
    }

    @Test
    public void addで渡した値とgetで得る値は同じであること() {
        testList.add("0");
        assertThat(testList.get(0), is("0"));
    }

    @Test
    public void sizeは要素の数と同じであること() {
        for (int i = 0; i < 10; i++) {
            testList.add(Integer.toString(i));
        }
        System.out.print(testList.size());
        assertThat(output.toString(), is("10"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getしたときに中身が無いと例外になること() {
        testList.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getに負の数を渡すと例外になること() {
        testList.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getで中身のない要素を得ようとすると例外になること() {
        testList.add("test0");
        testList.add("test1");
        testList.add("test2");
        testList.get(3);
    }
}

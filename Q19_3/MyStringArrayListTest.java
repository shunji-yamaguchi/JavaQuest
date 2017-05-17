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
    public void teardown() throws NullPointerException {
        testList = null;
    }

    @Test
    public void コンストラクタの動作を確認する() {
        assertNotNull(testList);
    }

    @Test
    public void 入出力テストをする() {
        for (int i = 0; i < 10; i++) {
            testList.add(Integer.toString(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(testList.get(i));
        }

        String ls = System.lineSeparator();
        assertThat(output.toString(), is("0" + ls
                + "1" + ls
                + "2" + ls
                + "3" + ls
                + "4" + ls
                + "5" + ls
                + "6" + ls
                + "7" + ls
                + "8" + ls
                + "9" + ls));
    }

    @Test
    public void サイズを確認する() {
        for (int i = 0; i < 10; i++) {
            testList.add(Integer.toString(i));
        }
        System.out.print(testList.size());

        assertThat(output.toString(), is("10"));
    }

    @Test(expected = NullPointerException.class)
    public void 中身を入れずにgetしてみる() {
        testList.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getに負の値を与えてみる() {
        testList.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getで中身のない要素を取ってみる() {
        testList.add("test0");
        testList.add("test1");
        testList.add("test2");
        testList.get(3);
    }

    @Test(expected = OutOfMemoryError.class)
    public void メモリを使い切ってみる() {
        while (true) {
            testList.add("0");
        }
    }
}

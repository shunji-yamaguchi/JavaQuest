package Q19_3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyStringArrayListTest {

    MyStringArrayList testList;

    @Before
    public void setup() {
        testList = new MyStringArrayList();
    }

    @Test
    public void コンストラクタ動作のあとはsizeが0であること() {
        assertThat(testList.size(), is(0));
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
        assertThat(testList.size(), is(10));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getに負の数を渡すとIndexOutOfBoundsExceptionになること() {
        testList.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void arrayCount以上の値を引数としてgetするとIndexOutOfBoundsExceptionになること() {
        testList.add("test0");
        testList.add("test1");
        testList.add("test2");
        testList.get(3);
    }
}

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

    @Test
    public void isEvenに10を渡すとtrueを返す() {
        assertTrue(NumberUtil.isEven(10));
    }

    @Test
    public void isEvenに7を渡すとfalseを返す() {
        assertFalse(NumberUtil.isEven(7));
    }
}

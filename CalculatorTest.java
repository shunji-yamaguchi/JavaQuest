import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void divideに6と2を渡すと3が得られること() {
        assertThat(calculator.divide(6, 2), is(3));
    }

    @Test
    public void divideに6と5を渡すと1が得られること() {
        assertThat(calculator.divide(6, 5), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void devideの第2引数にゼロを渡してIllegalArgumentExceptionが返ってくること() {
        calculator.divide(6, 0);
    }

}

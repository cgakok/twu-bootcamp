import com.twu28.Calculator;
import junit.framework.Assert;

import static junit.framework.Assert.*;

public class CalculatorTest {
    @org.junit.Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        double result = calculator.add(1, 2);

        assertEquals(3d, result);
    }
}

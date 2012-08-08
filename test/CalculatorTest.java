import com.twu28.Calculator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        //Given
        Calculator calculator = new Calculator();
        //When
        double result = calculator.add(1, 2);
        //Then
        assertThat(result, is(3d));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //Given
        Calculator calculator = new Calculator();
        //When
        double result = calculator.subtract(5, 3);
        //Then
        assertThat(result, is(2d));
    }

}

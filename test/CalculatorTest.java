import com.twu28.Calculator;
import com.twu28.RandomNumberGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    private Calculator calculator;
    private FakeRandomNumberGenerator randomNumberGenerator;

    @Before
    public void setUp() {

        randomNumberGenerator = new FakeRandomNumberGenerator();
        calculator = new Calculator(randomNumberGenerator);
    }

    @Test
    public void shouldAddTwoNumbers() {
        //When
        double result = calculator.add(1, 2);
        //Then
        assertThat(result, is(3d));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //When
        double result = calculator.subtract(5, 3);
        //Then
        assertThat(result, is(2d));
    }

    @Test
    public void shouldMultiplyANegativeNumberWithAPositiveNumber() {
        //When
        double result = calculator.multiply(-3, 4);
        //Then
        assertThat(result, is(-12d));
    }

    @Test
    public void shouldMultiplyByARandomNumber() {
        //Given
        randomNumberGenerator.setRandomNumber(5);
        //When
        double result = calculator.multiplyByRandom(3);
        //Then
        assertThat(result, is(15d));
    }
}

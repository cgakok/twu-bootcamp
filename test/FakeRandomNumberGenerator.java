import com.twu28.RandomNumberGenerator;

public class FakeRandomNumberGenerator extends RandomNumberGenerator {
    private double random;

    public void setRandomNumber(double random) {
        this.random = random;
    }

    public double generate() {
        return random;
    }
}

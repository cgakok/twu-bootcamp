package com.twu28;

public class Calculator {
    private RandomNumberGenerator randomNumberGenerator;

    public Calculator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double multiplyByRandom(double number) {
        return multiply(number, randomNumberGenerator.generate());
    }
}

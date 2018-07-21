package dev.peruch.sub.business;

public class Sub implements Calculator {
    @Override
    public double execute(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}

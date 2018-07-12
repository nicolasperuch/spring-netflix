package dev.peruch.springcloudnetflixoss.business;

public class Sum implements Calculator {

    @Override
    public double execute(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}

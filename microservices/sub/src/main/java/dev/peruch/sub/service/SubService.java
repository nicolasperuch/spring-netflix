package dev.peruch.sub.service;

import dev.peruch.sub.business.Sub;

public class SubService {

    private final Sub sub;

    public SubService(Sub sub) {
        this.sub = sub;
    }

    public String execute(double firstValue, double secondValue) {
        return "The sub of " + firstValue + " and " + secondValue + " is " +
                sub.execute(firstValue, secondValue);
    }

}

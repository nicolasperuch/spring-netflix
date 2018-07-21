package dev.peruch.springcloudnetflixoss.service;

import dev.peruch.springcloudnetflixoss.business.Sum;
import org.springframework.stereotype.Service;

@Service
public class SumService {

    private final Sum sum;

    public SumService(Sum sum) {
        this.sum = sum;
    }

    public String execute(double firstValue, double secondValue) {
        return "The sum of " + firstValue + " and " + secondValue + " is " +
                sum.execute(firstValue, secondValue);
    }

}

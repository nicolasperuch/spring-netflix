package dev.peruch.springcloudnetflixoss.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import dev.peruch.springcloudnetflixoss.business.Sum;
import org.springframework.stereotype.Service;

@Service
public class SumService {

    private final Sum sum;

    public SumService(Sum sum) {
        this.sum = sum;
    }

    @HystrixCommand(fallbackMethod = "reliable")
    public String execute(double firstValue, double secondValue) {
        return "The sum of " + firstValue + " and " + secondValue + " is " +
                sum.execute(firstValue, secondValue);
    }

    public String reliable(double firstValue, double secondValue) {
        return "ERROR";
    }

}

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
    public double execute(double firstValue, double secondValue) {
        return sum.execute(firstValue, secondValue);
    }

    public double reliable(double firstValue, double secondValue) {
        return -1;
    }

}

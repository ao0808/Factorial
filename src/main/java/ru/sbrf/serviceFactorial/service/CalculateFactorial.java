package ru.sbrf.serviceFactorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbrf.serviceFactorial.metrics.FactorialMetrics;

@Service
public class CalculateFactorial {
    private FactorialMetrics factorialMetrics;

    public CalculateFactorial() {}

    @Autowired
    public CalculateFactorial(FactorialMetrics factorialMetrics) {
        this.factorialMetrics = factorialMetrics;
    }

    public double calculate(int factorialNum) {
        if (factorialNum > 100 || factorialNum < 0) {
            throw new IllegalArgumentException("Не верное значение");
        }
        double result = 1;
        for (int i = 1; i <= factorialNum; i++) {
            result *= i;
        }
        return result;
    }
}

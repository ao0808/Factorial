package ru.sbrf.serviceFactorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.sbrf.serviceFactorial.interfaces.CalculateFactorialInterface;
import ru.sbrf.serviceFactorial.metrics.FactorialMetrics;

@Component
public class CalculateFactorialWithMetrics implements CalculateFactorialInterface {
    private final FactorialMetrics factorialMetrics;
    private final CalculateFactorial calculateFactorial;

    @Autowired
    public CalculateFactorialWithMetrics(FactorialMetrics factorialMetrics, CalculateFactorial calculateFactorial) {
        this.factorialMetrics = factorialMetrics;
        this.calculateFactorial = calculateFactorial;
    }

    @Override
    public double calculate(int factorialNum) {
        long startTime = System.currentTimeMillis();
        double result = calculateFactorial.calculate(factorialNum);
        factorialMetrics.incrementFactorialCalls();
        factorialMetrics.recordFactorialTime(System.currentTimeMillis() - startTime);
        return result;
    }
}

package ru.sbrf.serviceFactorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbrf.serviceFactorial.interfaces.CalculateFactorialInterface;
import ru.sbrf.serviceFactorial.metrics.FactorialMetrics;

@Service
public class CalculateFactorial implements CalculateFactorialInterface {
    @Override
    public double calculate(int factorialNum) {
        validateFactorialInput(factorialNum);
        return getResult(factorialNum);
    }

    private void validateFactorialInput(int factorialNum) {
        if (factorialNum > 100 || factorialNum < 0) {
            throw new IllegalArgumentException("Неверное значение аргумента");
        }
    }

    private double getResult(int factorialNum) {
        double result = 1;
        for (int i = 1; i <= factorialNum; i++) {
            result *= i;
        }
        return result;
    }
}

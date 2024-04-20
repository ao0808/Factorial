package ru.sbrf.serviceFactorialTest;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.serviceFactorial.service.CalculateFactorial;

public class ServiceFactorialTest extends Assert {

    @Test
    public void calcTest(){
        int x = 99;
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        double result = calculateFactorial.calculate(x);
        Assertions.assertEquals(9.33262154439441E155, result);
    }

    @Test
    public void calcZeroTest(){
        int x = 1;
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        double result = calculateFactorial.calculate(x);
        Assertions.assertEquals(1, result);
    }
}

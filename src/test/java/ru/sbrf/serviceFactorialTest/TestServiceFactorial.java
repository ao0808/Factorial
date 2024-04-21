package ru.sbrf.serviceFactorialTest;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.serviceFactorial.service.CalculateFactorial;

public class TestServiceFactorial extends Assert {

    @Test
    public void calcTest(){
        int x = 99;
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        Assertions.assertNotNull(calculateFactorial);
        double result = calculateFactorial.calculate(x);
        Assertions.assertEquals(9.33262154439441E155, result);
    }

    @Test
    public void calcZeroTest(){
        int x = 0;
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        double result = calculateFactorial.calculate(x);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void calcOneTest(){
        int x = 1;
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        double result = calculateFactorial.calculate(x);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void calcNegativeTest(){
        int x = -1;
        CalculateFactorial calculateFactorial = new CalculateFactorial();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculateFactorial.calculate(x);
        });
        Assertions.assertTrue(exception.getMessage().contains("Неверное значение аргумента"));
    }

    @Test
    public void calcBigNumberTest(){
        int x = 101;
        CalculateFactorial calculateFactorial = new CalculateFactorial();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculateFactorial.calculate(x);
        });
        Assertions.assertTrue(exception.getMessage().contains("Неверное значение аргумента"));
    }
}

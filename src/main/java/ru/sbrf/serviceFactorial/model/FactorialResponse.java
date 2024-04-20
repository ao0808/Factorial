package ru.sbrf.serviceFactorial.model;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FactorialResponse {
    private double result;
}

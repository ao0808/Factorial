package ru.sbrf.serviceFactorial.model;

public class FactorialRequest {
    private int factorialNum;

    public FactorialRequest() {}

    public FactorialRequest(int factorialNum) {
        this.factorialNum = factorialNum;
    }

    public int getFactorialNum() {
        return factorialNum;
    }

    public void setFactorialNum(int factorialNum) {
        this.factorialNum = factorialNum;
    }
}

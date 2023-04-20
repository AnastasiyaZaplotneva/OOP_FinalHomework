package org.example;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int argReal, int argImaginary) {
        return new Calculator(argReal, argImaginary);
    }
}

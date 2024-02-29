package core.calculator.operations;

import core.calculator.Calculate;
import core.calculator.ComplexNumber;

public class Division implements Calculate {
    @Override
    public ComplexNumber getResult(ComplexNumber a, ComplexNumber b) {
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary())/
                (b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary());

        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary())/
                (b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary());

        return new ComplexNumber(real, imaginary);
    }
}

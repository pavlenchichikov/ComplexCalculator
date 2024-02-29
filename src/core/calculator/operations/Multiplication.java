package core.calculator.operations;

import core.calculator.Calculate;
import core.calculator.ComplexNumber;

public class Multiplication implements Calculate {

    @Override
    public ComplexNumber getResult(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal()*b.getReal()-a.getImaginary()*b.getImaginary(),
                a.getReal()* b.getImaginary()+b.getReal()*a.getImaginary() );
    }
}

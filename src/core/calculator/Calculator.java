package core.calculator;

import core.calculator.operations.Division;
import core.calculator.operations.Multiplication;
import core.calculator.operations.Substraction;
import core.calculator.operations.Sum;
import core.util.Operators;

import java.util.HashMap;

public class Calculator {
    HashMap<String,Calculate> computer;
    public Calculator() {
        computer = new HashMap<String,Calculate>();
        computer.put(Operators.ADD.operator(), (Calculate) new Sum());
        computer.put(Operators.SUBSTRACT.operator(), new Substraction());
        computer.put(Operators.MULTIPLY.operator(), new Multiplication());
        computer.put(Operators.DIVIDE.operator(), new Division());
    }
    public ComplexNumber calculate(String action,ComplexNumber a, ComplexNumber b) {
        return computer.get(action).getResult(a,b);
    }

}


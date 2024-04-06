package io.example.ex2.calculator.v4;

public class Calculator {
    public static int calculate(int firstOperand, String operator, int secondOperand) {
        return OperatorType.operate(firstOperand, operator, secondOperand);
    }
}

package io.example.ex2.calculator.v5.operator;

public class Subtraction implements Operator {
    private static final String SUBTRACTION_OPERATOR = "-";

    @Override
    public boolean isMatched(String operator) {
        return operator.equals(SUBTRACTION_OPERATOR);
    }

    @Override
    public int operate(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }
}

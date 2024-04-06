package io.example.ex2.calculator.v5.operator;

public class Addition implements Operator {
    private static final String ADDITION_OPERATOR = "+";

    @Override
    public boolean isMatched(String operator) {
        return operator.equals(ADDITION_OPERATOR);
    }

    @Override
    public int operate(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }
}

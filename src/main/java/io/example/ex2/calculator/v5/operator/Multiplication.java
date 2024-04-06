package io.example.ex2.calculator.v5.operator;

public class Multiplication implements Operator {
    private static final String MULTIPLICATION_OPERATOR = "*";

    @Override
    public boolean isMatched(String operator) {
        return operator.equals(MULTIPLICATION_OPERATOR);
    }

    @Override
    public int operate(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
}

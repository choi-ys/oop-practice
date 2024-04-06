package io.example.ex2.calculator.v5.operator;

public interface Operator {
    boolean isMatched(String operator);
    int operate(int firstOperand, int secondOperand);
}

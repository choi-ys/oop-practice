package io.example.ex2.calculator.v1;

public class Calculator {
    public static int calculate(int num1, String operator, int num2) {
        if ("+".equals(operator)) {
            return num1 + num2;
        }
        if ("-".equals(operator)) {
            return num1 - num2;
        }
        if ("/".equals(operator)) {
            if (num2 == 0) {
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            return num1 / num2;
        }
        if ("*".equals(operator)) {
            return num1 * num2;
        }
        throw new IllegalArgumentException("올바른 연산자가 아닙니다.");
    }
}

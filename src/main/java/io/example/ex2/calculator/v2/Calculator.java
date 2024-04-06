package io.example.ex2.calculator.v2;

public class Calculator {
    public static final String DIVIDED_ZERO_EXCEPTION_MESSAGE = "0으로 나눌 수 없습니다.";
    public static final String WRONG_EXCEPTION_MESSAGE = "올바른 연산자가 아닙니다.";
    public static final String ADDITION = "+";
    public static final String SUBTRACTION = "-";
    public static final String DIVISION = "/";
    public static final String MULTIPLICATION = "*";

    public static int calculate(int firstOperand, String operator, int secondOperand) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case DIVISION:
                validateDividedIsZero(secondOperand);
                return firstOperand / secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
        }
        throw new IllegalArgumentException(WRONG_EXCEPTION_MESSAGE);
    }

    private static void validateDividedIsZero(int divisor) {
        if (isZeroDivisor(divisor)) {
            throw new IllegalArgumentException(DIVIDED_ZERO_EXCEPTION_MESSAGE);
        }
    }

    private static boolean isZeroDivisor(int divisor) {
        return divisor == 0;
    }
}

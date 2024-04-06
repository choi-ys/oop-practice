package io.example.ex2.calculator.v4;

import java.util.Arrays;

public enum OperatorType {
    ADDITION("+") {
        @Override
        public int operate(int firstOperand, int secondOperand) {
            return firstOperand + secondOperand;
        }
    },
    SUBTRACTION("-") {
        @Override
        public int operate(int firstOperand, int secondOperand) {
            return firstOperand - secondOperand;
        }
    },
    DIVISION("/") {
        @Override
        public int operate(int firstOperand, int secondOperand) {
            Divisor divisor = Divisor.from(secondOperand);
            return firstOperand / divisor.toInt();
        }
    },
    MULTIPLICATION("*") {
        @Override
        public int operate(int firstOperand, int secondOperand) {
            return firstOperand * secondOperand;
        }
    };

    public static final String WRONG_OPERATOR_EXCEPTION_MESSAGE = "올바른 연산자가 아닙니다.";

    final String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    protected abstract int operate(int firstOperand, int secondOperand);

    public static int operate(int firstOperand, String operator, int secondOperand) {
        return Arrays.stream(values())
            .filter(o -> o.operator.equals(operator))
            .map(t -> t.operate(firstOperand, secondOperand))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(WRONG_OPERATOR_EXCEPTION_MESSAGE));
    }
}

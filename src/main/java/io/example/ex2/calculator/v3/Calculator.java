package io.example.ex2.calculator.v3;

import static io.example.ex2.calculator.v3.OperatorType.values;
import static java.util.Arrays.stream;

public class Calculator {
    public static final String WRONG_OPERATOR_EXCEPTION_MESSAGE = "올바른 연산자가 아닙니다.";

    public static int calculate(int firstOperand, String operator, int secondOperand) {
        return stream(values())
            .filter(o -> o.operator.equals(operator))
            .map(t -> t.operate(firstOperand, secondOperand))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(WRONG_OPERATOR_EXCEPTION_MESSAGE));
    }
}

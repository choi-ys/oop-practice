package io.example.ex2.calculator.v5;

import io.example.ex2.calculator.v5.operator.Addition;
import io.example.ex2.calculator.v5.operator.Division;
import io.example.ex2.calculator.v5.operator.Multiplication;
import io.example.ex2.calculator.v5.operator.Operator;
import io.example.ex2.calculator.v5.operator.Subtraction;
import java.util.List;

public class Calculator {
    public static final String WRONG_OPERATOR_EXCEPTION_MESSAGE = "올바른 연산자가 아닙니다.";
    private static final List<Operator> operators = List.of(new Addition(), new Subtraction(), new Division(), new Multiplication());

    public static int calculate(int firstOperand, String operator, int secondOperand) {
        return operators.stream()
            .filter(o -> o.isMatched(operator))
            .map(t -> t.operate(firstOperand, secondOperand))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(WRONG_OPERATOR_EXCEPTION_MESSAGE));
    }
}

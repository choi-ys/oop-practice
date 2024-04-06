package io.example.ex2.calculator.v1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator:V1")
public class CalculatorTest {
    private static final int firstOperand = 2;
    private static final int secondOperand = 2;

    @Test
    @DisplayName("덧셈")
    void add() {
        // Given
        final String operator = "+";

        // When
        final int actual = Calculator.calculate(firstOperand, operator, secondOperand);

        // Then
        assertThat(actual).isEqualTo(firstOperand + secondOperand);
    }

    @Test
    @DisplayName("뺼셈")
    void minus() {
        // Given
        final String operator = "-";

        // When
        final int actual = Calculator.calculate(firstOperand, operator, secondOperand);

        // Then
        assertThat(actual).isEqualTo(firstOperand - secondOperand);
    }

    @Test
    @DisplayName("나눗셈")
    void division() {
        // Given
        final String operator = "/";

        // When
        final int actual = Calculator.calculate(firstOperand, operator, secondOperand);

        // Then
        assertThat(actual).isEqualTo(firstOperand / secondOperand);
    }

    @Test
    @DisplayName("0으로 나누는 경우 예외가 발생한다.")
    void throwException_WhenDividedZero() {
        // Given
        final int zeroDivisor = 0;
        final String operator = "/";

        // When & Then
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Calculator.calculate(firstOperand, operator, zeroDivisor))
        ;
    }

    @Test
    @DisplayName("곱셈")
    void multiply() {
        // Given
        final String operator = "*";

        // When
        final int actual = Calculator.calculate(firstOperand, operator, secondOperand);

        // Then
        assertThat(actual).isEqualTo(firstOperand * secondOperand);
    }
    
    @Test
    @DisplayName("사칙 연산이 아닌 경우 예외가 발생한다.")
    void throwException_GivenNotForBasicOperations() {
        // Given
        final String wrongOperator = "%";
    
        // When & Then
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Calculator.calculate(firstOperand, wrongOperator, secondOperand));
    }
}

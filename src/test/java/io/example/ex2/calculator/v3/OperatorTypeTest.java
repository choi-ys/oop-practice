package io.example.ex2.calculator.v3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("OperatorType")
class OperatorTypeTest {
    private static final int firstOperand = 1;
    private static final int secondOperand = 1;

    @ParameterizedTest
    @MethodSource
    @DisplayName("사칙 연산")
    void operatorType(final OperatorType given, final int expected) {
        // When
        int actual = given.operate(firstOperand, secondOperand);

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> operatorType() {
        return Stream.of(
            Arguments.of(OperatorType.ADDITION, firstOperand + secondOperand),
            Arguments.of(OperatorType.SUBTRACTION, firstOperand - secondOperand),
            Arguments.of(OperatorType.DIVISION, firstOperand / secondOperand),
            Arguments.of(OperatorType.MULTIPLICATION, firstOperand * secondOperand)
        );
    }

    @Test
    @DisplayName("0으로 나누는 경우 예외가 발생한다.")
    void throwException_WhenDivisorIsZero() {
        // Given
        final int zeroDivisor = 0;

        // When & Then
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> OperatorType.DIVISION.operate(firstOperand, zeroDivisor));
    }
}

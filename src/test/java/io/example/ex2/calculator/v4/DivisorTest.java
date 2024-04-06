package io.example.ex2.calculator.v4;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Divisor")
class DivisorTest {
    @ParameterizedTest
    @ValueSource(ints = {-1, 1})
    @DisplayName("제수 객체 생성")
    void create(final int given) {
        // When & Then
        assertThatCode(() -> Divisor.from(given))
            .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("제수가 0인 경우 예외가 발생한다.")
    void throwException_WhenZeroDivisor() {
        // Given
        final int zeroDivisor = 0;

        // When & Then
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Divisor.from(zeroDivisor));
    }
}

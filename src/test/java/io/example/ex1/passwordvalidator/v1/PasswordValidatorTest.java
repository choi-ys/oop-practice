package io.example.ex1.passwordvalidator.v1;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("PasswordValidator:V1")
public class PasswordValidatorTest {
    @Test
    @DisplayName("비밀번호는 8자 이상 12자 이하여야 한다.")
    void validate() {
        // Given
        final String given = "12345678";

        // When & Then
        assertThatCode(() -> PasswordValidator.validate(given))
            .doesNotThrowAnyException();
    }

    @ParameterizedTest(name = "[#{index}]{1}:{0}")
    @MethodSource
    @DisplayName("비밀번호가 8자 미만, 12자 초과인 경우 예외가 발생한다.")
    void throwException_underLengthOrOverLength(final String given) {
        // When & Then
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> PasswordValidator.validate(given))
        ;
    }

    private static Stream<Arguments> throwException_underLengthOrOverLength() {
        return Stream.of(
            Arguments.of("1234567", "8자 미만인 경우"),
            Arguments.of("1234567890123", "12자를 초과하는 경우")
        );
    }
}

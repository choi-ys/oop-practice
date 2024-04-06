package io.example.ex4.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThatCode;

@DisplayName("Cook")
class CookTest {

    @Test
    @DisplayName("요리를 생성한다")
    void create() {
        // Given
        final String name = "뽈찜";
        final BigDecimal price = BigDecimal.valueOf(15000L);

        // When & Then
        assertThatCode(() -> Cook.of(name, price))
                .doesNotThrowAnyException();
    }
}
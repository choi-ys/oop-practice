package io.example.ex4.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Cooker")
class ChefTest {

    @Test
    @DisplayName("메뉴에 해당하는 음식을 만든다")
    void makeCook() {
        // Given
        final String name = "뽈찜";
        final BigDecimal price = BigDecimal.valueOf(15000L);

        MenuItem menuItem = MenuItem.of(name, price);

        Chef chef = new Chef();

        // When
        Cook cook = chef.makeCook(menuItem);

        // Then
        assertThat(cook).isEqualTo(Cook.from(menuItem));
    }
}
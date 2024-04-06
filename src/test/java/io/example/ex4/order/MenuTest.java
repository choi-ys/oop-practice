package io.example.ex4.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

@DisplayName("Menu")
class MenuTest {
    private static final MenuItem firstMenuItem = MenuItem.of("뽈찜", BigDecimal.valueOf(15000L));
    private static final MenuItem secondMenuItem = MenuItem.of("해물파전", BigDecimal.valueOf(12000L));
    private static final List<MenuItem> menuItems = List.of(firstMenuItem, secondMenuItem);
    private static final Menu menu = Menu.of(menuItems);

    @Test
    @DisplayName("메뉴 이름에 해당하는 메뉴를 반환한다")
    void choose() {
        // When
        MenuItem choosedMenuItem = menu.choose(firstMenuItem.getName());

        // Then
        assertThat(choosedMenuItem).isEqualTo(firstMenuItem);
    }

    @Test
    @DisplayName("메뉴판에 존재하지 않는 메뉴 선택 시 예외가 발생 한다.")
    void throwException_GivenNotExistMenuItemName() {
        // When & Then
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> menu.choose("부추전"));
    }
}
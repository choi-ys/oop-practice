package io.example.ex4.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Customer")
class CustomerTest {
    @Test
    @DisplayName("메뉴 이름에 해당하는 요리를 주문한다.")
    void order() {
        // Given
        MenuItem firstMenuItem = MenuItem.of("뽈찜", BigDecimal.valueOf(15000L));
        MenuItem secondMenuItem = MenuItem.of("해물파전", BigDecimal.valueOf(12000L));
        List<MenuItem> menuItems = List.of(firstMenuItem, secondMenuItem);
        Menu menu = Menu.of(menuItems);
        Chef chef = new Chef();

        Customer customer = new Customer();

        Cook cook = customer.order(firstMenuItem.getName(), menu, chef);

        // Then
        assertThat(cook).isEqualTo(Cook.from(firstMenuItem));
    }
}
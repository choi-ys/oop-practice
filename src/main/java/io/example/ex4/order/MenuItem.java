package io.example.ex4.order;

import io.example.ex4.order.wrap.Name;
import io.example.ex4.order.wrap.Price;

import java.math.BigDecimal;

public class MenuItem {
    private final Name name;
    private final Price price;

    private MenuItem(String name, BigDecimal price) {
        this.name = Name.from(name);
        this.price = Price.from(price);
    }

    public static MenuItem of(String name, BigDecimal price) {
        return new MenuItem(name, price);
    }

    public String getName() {
        return name.getValue();
    }

    public boolean matches(String target) {
        return name.isEquals(target);
    }

    public BigDecimal getPrice() {
        return price.getValue();
    }
}

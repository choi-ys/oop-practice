package io.example.ex4.order;

import io.example.ex4.order.wrap.Name;
import io.example.ex4.order.wrap.Price;

import java.math.BigDecimal;
import java.util.Objects;

public class Cook {
    private final Name name;
    private final Price price;

    public Cook(String name, BigDecimal price) {
        this.name = Name.from(name);
        this.price = Price.from(price);
    }

    public static Cook from(MenuItem menuItem) {
        return new Cook(menuItem.getName(), menuItem.getPrice());
    }

    public static Cook of(String name, BigDecimal price) {
        return new Cook(name, price);
    }

    public String getName() {
        return name.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cook cook = (Cook) o;
        return Objects.equals(name, cook.name) && Objects.equals(price, cook.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

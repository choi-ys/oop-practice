package io.example.ex4.order.wrap;

import java.math.BigDecimal;
import java.util.Objects;

public class Price {
    private final BigDecimal value;

    public Price(BigDecimal price) {
        value = price;
    }

    public static Price from(BigDecimal price) {
        return new Price(price);
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return Objects.equals(value, price1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

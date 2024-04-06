package io.example.ex4.order.wrap;

import java.util.Objects;

public class Name {
    private final String value;

    public Name(String name) {
        value = name;
    }

    public static Name from(String name) {
        return new Name(name);
    }

    public String getValue() {
        return value;
    }

    public boolean isEquals(String target) {
        return value.equals(target);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

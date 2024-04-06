package io.example.ex3.gradeCalculator.v2;

public class Grade {
    private String value;

    public Grade(String value) {
        this.value = value;
    }

    public static Grade from(String value) {
        return new Grade(value);
    }
}

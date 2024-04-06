package io.example.ex3.gradeCalculator.v2;

import java.util.List;

public class Courses {
    private List<Course> elements;

    public Courses(List<Course> elements) {
        this.elements = elements;
    }

    public static Courses of(List<Course> elements) {
        return new Courses(elements);
    }

    public double getTotalScore() {
        return elements.stream()
            .mapToDouble(Course::getScoreByGrade)
            .sum();
    }

    public double getTotalCredit() {
        return elements.stream()
            .mapToDouble(Course::getCredit)
            .sum();
    }

    public double getAverGrade() {
        return getTotalScore() / getTotalCredit();
    }
}

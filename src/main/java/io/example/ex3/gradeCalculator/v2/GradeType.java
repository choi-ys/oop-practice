package io.example.ex3.gradeCalculator.v2;

import java.util.Arrays;

public enum GradeType {
    A_PLUS("A+", 4.5),
    A("A", 4.0),
    B_PLUS("B+", 3.5),
    B("B", 3.0),
    C_PLUS("C+", 2.5),
    C("C", 2.0),
    D_PLUS("D+", 1.5),
    D("D", 1.0),
    F("F", 0);

    private String grade;
    private double score;

    GradeType(String grade, double score) {
        this.grade = grade;
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    public static GradeType gradeOf(String grade) {
        return Arrays.stream(values())
            .filter(t -> grade.equals(t.grade))
            .findFirst()
            .orElseThrow();
    }
}

package io.example.ex3.gradeCalculator.v2;

import java.util.List;

public class GradeCalculator {
    public static final int HUNDRED = 100;
    public static final double HUNDRED_POINTS_ZERO = 100.0;

    public static double calculate(String subject, String grade, int credit) {
        Course course = Course.of(subject, grade, credit);
        return course.getScoreByGrade() / course.getCredit();
    }

    public static double calculate(List<Course> courses) {
        double averGrade = Courses.of(courses).getAverGrade();
        return processGradeExpression(averGrade);
    }

    private static double processGradeExpression(double averGrade) {
        return Math.round(averGrade * HUNDRED) / HUNDRED_POINTS_ZERO;
    }
}

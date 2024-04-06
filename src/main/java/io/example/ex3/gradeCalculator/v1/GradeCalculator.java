package io.example.ex3.gradeCalculator.v1;

import java.util.List;

public class GradeCalculator {
    public static double calculate(String course, String grade, int credit) {
        return gradeToScore(grade);
    }

    private static Double gradeToScore(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
        }
        throw new IllegalArgumentException("올바른 학점 정보가 아닙니다.");
    }

    public static double calculate(List<Course> courses) {
        double totalGrade = 0;
        double totalCredit = 0;
        for(Course course : courses){
            totalGrade += gradeToScore(course.getGrade()) * course.getCredit();
            totalCredit += course.getCredit();
        }
        double averGrade = totalGrade / totalCredit;
        return Math.round(averGrade * 100) / 100.0;
    }
}

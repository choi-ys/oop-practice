package io.example.ex3.gradeCalculator.v2;

import static io.example.ex3.gradeCalculator.v2.GradeType.gradeOf;

public class Course {
    private String subject;
    private GradeType gradeType;
    private int credit;

    public Course(String subject, GradeType gradeType, int credit) {
        this.subject = subject;
        this.gradeType = gradeType;
        this.credit = credit;
    }

    public static Course of(String subject, String grade, int credit) {
        return new Course(subject, gradeOf(grade), credit);
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public String getGrade() {
        return gradeType.getGrade();
    }

    public double getScore(){
        return gradeType.getScore();
    }

    public int getCredit() {
        return credit;
    }

    public double getScoreByGrade() {
        return getScore() * getCredit();
    }
}

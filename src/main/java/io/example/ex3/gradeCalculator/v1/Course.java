package io.example.ex3.gradeCalculator.v1;

public class Course {
    private String subject;
    private String grade;
    private int credit;

    private Course(String subject, String grade, int credit) {
        this.subject = subject;
        this.grade = grade;
        this.credit = credit;
    }

    public static Course of(String subject, String grade, int credit) {
        return new Course(subject, grade, credit);
    }

    public String getGrade() {
        return grade;
    }

    public int getCredit() {
        return credit;
    }
}

package io.example.ex3.gradeCalculator.v2;

import static io.example.ex3.gradeCalculator.v2.GradeType.A_PLUS;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Course:V2")
class CourseTest {
    @Test
    @DisplayName("과목 객체 생성")
    void create() {
        // Given
        final String subject = "oop";
        final String grade = "A+";
        final int credit = 3;

        // When
        Course actual = Course.of(subject, grade, credit);

        // Then
        assertThat(actual.getGradeType()).isEqualTo(A_PLUS);
        assertThat(actual.getGrade()).isEqualTo(A_PLUS.getGrade());
        assertThat(actual.getScore()).isEqualTo(A_PLUS.getScore());
    }
}

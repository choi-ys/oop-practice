package io.example.ex3.gradeCalculator.v2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("GradeType:V2")
class GradeTypeTest {
    @Test
    @DisplayName("학점을 입력 받아 학점 타입으로 반환한다.")
    void givenStringGrade_ThenReturnGradeType() {
        // Given
        final String given = "A+";

        // When
        GradeType actual = GradeType.gradeOf(given);

        // Then
        assertThat(actual).isEqualTo(GradeType.A_PLUS);
    }
}

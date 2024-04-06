package io.example.ex3.gradeCalculator.v2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("GradeCalculator:V2")
class GradeCalculatorTest {
    @ParameterizedTest()
    @MethodSource
    @DisplayName("한 과목 처리")
    void simpleMethod(
        final String subject,
        final String grade,
        final int credit,
        final double expected
    ) {
        // When
        double actual = GradeCalculator.calculate(subject, grade, credit);

        // Then
        assertEquals(actual, expected);
    }

    private static Stream<Arguments> simpleMethod() {
        return Stream.of(
            Arguments.of("oop", "A+", 3, 4.5),
            Arguments.of("oop", "B", 2, 3.0),
            Arguments.of("oop", "C+", 1, 2.5),
            Arguments.of("oop", "F", 3, 0)
        );
    }

    @Test
    @DisplayName("여러 과목 처리")
    void simpleMethod2() {
        List<Course> courses = List.of(
            Course.of("oop", "A+", 3),
            Course.of("자료구조", "A", 3),
            Course.of("교양철학", "B+", 2),
            Course.of("교양영어","C", 1)
        );

        // When
        double actual = GradeCalculator.calculate(courses);

        // Then
        final double expected = 3.83;
        assertEquals(expected, actual);
    }
}

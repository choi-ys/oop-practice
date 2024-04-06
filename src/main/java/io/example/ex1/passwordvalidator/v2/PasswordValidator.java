package io.example.ex1.passwordvalidator.v2;

public class PasswordValidator {
    private static final int MIN_PASSWORD = 8;
    private static final int MAX_PASSWORD = 12;
    private static final String PASSWORD_LENGTH_EXCEPTION_GUIDE_MESSAGE = String.format("비밀번호 길이는 %d자 이상 %d자 이하로 입력하세요", MIN_PASSWORD, MAX_PASSWORD);
    private static final String PASSWORD_UNDER_LENGTH_EXCEPTION_MESSAGE = String.format("비밀번호가 %d자 미만입니다. %s", MIN_PASSWORD, PASSWORD_LENGTH_EXCEPTION_GUIDE_MESSAGE);
    private static final String PASSWORD_OVER_LENGTH_EXCEPTION_MESSAGE = String.format("비밀번호가 %d자를 초과하였습니다. %s", MAX_PASSWORD,
        PASSWORD_LENGTH_EXCEPTION_GUIDE_MESSAGE);

    public static void validate(String given) {
        int length = given.length();
        validateUnderLength(length);
        validateOverLength(length);
    }

    private static void validateUnderLength(int length) {
        if (isUnderLength(length)) {
            throw new IllegalArgumentException(PASSWORD_UNDER_LENGTH_EXCEPTION_MESSAGE);
        }
    }

    private static boolean isUnderLength(int length) {
        return length < MIN_PASSWORD;
    }

    private static void validateOverLength(int length) {
        if (isOverLength(length)) {
            throw new IllegalArgumentException(PASSWORD_OVER_LENGTH_EXCEPTION_MESSAGE);
        }
    }

    private static boolean isOverLength(int length) {
        return length > MAX_PASSWORD;
    }
}

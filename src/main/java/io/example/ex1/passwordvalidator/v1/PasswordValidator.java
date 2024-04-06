package io.example.ex1.passwordvalidator.v1;

public class PasswordValidator {
    public static void validate(String password) {
        if(password.length() < 8 || password.length() > 12){
            throw new IllegalArgumentException("비밀번호 길이는 8자 이상 12자 이하로 입력하세요");
        }
    }
}

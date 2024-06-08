package com.example.homework6.task1;

public class Runnable {
    private final static int MAX_LOGIN_LENGTH = 20;
    private final static int MAX_PASSWORD_LENGTH = 20;

    public static void main(String[] args) {
        System.out.println(signUp("My Login", "12345", "12345"));
        System.out.println(signUp("MyLogin", "12345", "1234"));
        System.out.println(signUp(
                "MyLogin",
                "123455789012345678901",
                "123455789012345678901")
        );
        System.out.println(signUp("MyLogin", "abc", "abc"));
        System.out.println(signUp("MyLogin", "12345", "12345"));

    }

    public static boolean signUp(String login, String password, String confirmPassword) {
        try {
            if (login.length() > MAX_LOGIN_LENGTH || login.contains(" ")) {
                throw new WrongLoginException();
            }
            if (
                    password.length() > MAX_PASSWORD_LENGTH
                            || password.contains(" ")
                            || !password.matches(".*\\d.*")
                            || !password.equals(confirmPassword)
            ) {
                throw new WrongPasswordException();
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }
}

package com.teachmeskills.hw.lesson_13.util;

import com.teachmeskills.hw.lesson_13.exception.WrongLoginException;
import com.teachmeskills.hw.lesson_13.exception.WrongPasswordException;

public class CredentialsValidator {

    //1st method to validate credentials - using String methods
    public static boolean credentialsCheck(String login, String password, String confirmPassword) throws
            WrongLoginException, WrongPasswordException {

        if (!password.equals(confirmPassword) && password.length() >= 20 && password.contains(" ") && !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password should be less than 20 characters and not contain spaces.");
        }
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login should be less than 20 characters and not contain spaces.");
        }
        return true;
    }

    //2nd method to validate credentials - using char array
    public static boolean credentialsCheckInArray(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || containsSpace(login)) {
            throw new WrongLoginException("Login should be less than 20 characters and not contain spaces. 2nd");
        }

        if (password.length() >= 20 || containsSpace(password) || !containsDigit(password)) {
            throw new WrongPasswordException("Password should be less than 20 characters and not contain spaces" +
                    " and include at least one digit. 2nd");
        }

        if (!passwordsCheck(password.toCharArray(), confirmPassword.toCharArray())) {
            throw new WrongPasswordException("Password and confirmPassword do not match. 2nd");
        }

        return true;
    }

    private static boolean passwordsCheck(char[] password, char[] confirmPassword) {
        if (password.length != confirmPassword.length) {
            return false;
        }
        for (int i = 0; i < password.length; i++) {
            if (password[i] != confirmPassword[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsSpace(String str) {
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                return true;
            }
        }
        return false;
    }

    private static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}

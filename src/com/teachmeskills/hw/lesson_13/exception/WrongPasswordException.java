package com.teachmeskills.hw.lesson_13.exception;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

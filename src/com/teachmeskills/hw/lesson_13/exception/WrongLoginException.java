package com.teachmeskills.hw.lesson_13.exception;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

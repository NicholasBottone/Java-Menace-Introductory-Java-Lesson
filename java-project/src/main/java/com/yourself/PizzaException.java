package com.yourself;

public class PizzaException extends Exception {
    private static final long serialVersionUID = 123;

    public PizzaException(String message) {
        super(message);
    }
}
package com.springrest.springrest.Controller;

public class courseNotFoundException extends RuntimeException{
    public courseNotFoundException(String message) {
        super(message);
    }
}

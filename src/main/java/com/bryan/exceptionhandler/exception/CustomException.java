package com.bryan.exceptionhandler.exception;


public class CustomException extends Exception {

    private static final long serialVersionUID=1L;

    public CustomException(){
        super("This is custom exception");
    }
}
package com.sqli.patterns.example;

/**
 * Created by eric.manuguerra on 27.08.2014.
 */
public class ValidationHandler implements ATMRequestHandler {


    private ATMRequestHandler nextHandler;

    @Override
    public void handleRequest(Integer amount) {
        if (amount % 10 != 0) {
            System.out.println("This amount can't be handled since it is not a multiple of 10");
        } else {
            nextHandler.handleRequest(amount);
        }
    }

    @Override
    public void setNextHandler(ATMRequestHandler handler) {
        nextHandler = handler;
    }
}

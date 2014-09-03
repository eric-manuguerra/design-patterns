package com.sqli.patterns.example1;

/**
 * Created by eric.manuguerra on 27.08.2014.
 */
public abstract class AbstractATMHandler implements ATMRequestHandler {


    private ATMRequestHandler nextHandler;

    public void handleRequest(Integer amount) {

        if (amount >= getValue()) {

            final int nbOfNotes = amount / getValue();
            final int remain = amount % getValue();
            System.out.println("Dispensing " + nbOfNotes + " " + getValue() + " EUR notes");
            if (remain != 0) {
                nextHandler.handleRequest(remain);
            }

        } else {

            if (nextHandler != null) {
                nextHandler.handleRequest(amount);
            }

        }
    }

    protected abstract int getValue();

    @Override
    public void setNextHandler(ATMRequestHandler handler) {
        nextHandler = handler;
    }
}

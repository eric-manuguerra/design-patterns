package com.sqli.patterns.state.sample;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class Approved implements DocumentState {

    @Override
    public void promote(Document document) {
        // ex : verified state validation, send email to reviewer ...
        System.out.println("Approved document.");
        // State doesn't changed.
    }

    @Override
    public void print() {
        // Business rules for printing
    }

}

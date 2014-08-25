package com.sqli.patterns.state.sample;

/**
 * Created by emanuguerra on 25.08.2014.
 */
public class Approved implements DocumentState {

    @Override
    public void promote() {
        // ex : verified state validation, send email to reviewer ...
        System.out.println("Approved document.");
    }

}

package com.sqli.patterns.state.sample;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class Verified  implements DocumentState {

    @Override
    public void promote() {
        // Actions specific to Verified state document promotion
        // ex : verified state validation, send email to reviewer ...
        System.out.println("Promoting Verified -> Approved");
    }


    @Override
    public void print() {
        // Business rules for printing
    }

}

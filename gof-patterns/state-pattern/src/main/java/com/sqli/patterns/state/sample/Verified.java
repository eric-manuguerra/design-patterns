package com.sqli.patterns.state.sample;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class Verified  implements DocumentState {

    @Override
    public void promote(Document document) {
        // Actions specific to Verified state document promotion
        // ex : verified state validation, send email to reviewer ...
        System.out.println("Promoting Verified -> Approved");
        document.setState(new Approved());
    }


    @Override
    public void print() {
        // Business rules for printing
    }

}

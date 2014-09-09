package com.sqli.patterns.state.sample;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class Draft  implements DocumentState {

    @Override
    public void promote(Document document) {
        // Actions specific to Draft state document promotion
        // ex : draft state validation, send email to reviewer ...
        System.out.println("Promoting Draft -> Verified");
        document.setState(new Verified());
    }

    @Override
    public void print() {
        // Business rules for printing
    }
}

package com.sqli.patterns.state.sample;

/**
 * Created by emanuguerra on 25.08.2014.
 */
public class Draft  implements DocumentState {

    @Override
    public void promote() {
        // Actions specific to Draft state document promotion
        // ex : draft state validation, send email to reviewer ...
        System.out.println("Promoting Draft -> Verified");
    }
}

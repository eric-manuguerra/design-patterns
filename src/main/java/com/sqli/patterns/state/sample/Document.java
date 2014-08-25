package com.sqli.patterns.state.sample;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class Document {

    private DocumentState state;

    public DocumentState getState() {
        return state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void promote() {
        state.promote();
    }
}

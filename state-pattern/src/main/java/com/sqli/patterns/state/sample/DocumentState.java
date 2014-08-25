package com.sqli.patterns.state.sample;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public interface DocumentState {

    /**
     * Changes state of document towards approval.
     */
    void promote();

    /**
     * Prints the document.
     */
    void print();

}

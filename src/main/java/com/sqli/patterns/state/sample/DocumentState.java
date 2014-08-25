package com.sqli.patterns.state.sample;

/**
 * Created by emanuguerra on 25.08.2014.
 */
public interface DocumentState {

    /**
     * Changes state of document towards approval.
     */
    void promote();

}

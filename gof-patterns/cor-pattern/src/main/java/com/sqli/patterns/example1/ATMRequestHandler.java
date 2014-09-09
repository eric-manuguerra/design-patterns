package com.sqli.patterns.example1;

/**
 * Created by eric.manuguerra on 27.08.2014.
 */
public interface ATMRequestHandler {

    void handleRequest(Integer amount);

    void setNextHandler(ATMRequestHandler handler);

}

package com.sqli.patterns;

import org.junit.Test;

/**
 * Created by eric.manuguerra on 27.08.2014.
 */
public class CoRTest {

    @Test
    public void testATMHandler() {

        ATMRequestHandler validationHandler = new ValidationHandler();
        ATMRequestHandler handler200 = new Euro200Handler();
        ATMRequestHandler handler100 = new Euro100Handler();
        ATMRequestHandler handler50 = new Euro50Handler();
        ATMRequestHandler handler10 = new Euro10Handler();

        handler200.setNextHandler(handler100);
        handler100.setNextHandler(handler50);
        handler50.setNextHandler(handler10);
        validationHandler.setNextHandler(handler200);

        validationHandler.handleRequest(1510);

        validationHandler.handleRequest(1503);


    }
}

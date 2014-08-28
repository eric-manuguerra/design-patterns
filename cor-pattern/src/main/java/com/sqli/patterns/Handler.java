package com.sqli.patterns;

/**
 * Created by eric.manuguerra on 28.08.2014.
 */
public abstract class Handler {

    Handler nextHandler;

    abstract void handle(Request request);

}

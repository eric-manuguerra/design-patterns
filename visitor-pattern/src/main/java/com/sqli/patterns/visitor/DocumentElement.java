package com.sqli.patterns.visitor;

/**
 * Created by eric.manuguerra on 04.09.2014.
 */
public interface DocumentElement {

    void accept(Visitor visitor);
}

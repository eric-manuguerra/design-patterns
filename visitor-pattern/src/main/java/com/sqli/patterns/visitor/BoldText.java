package com.sqli.patterns.visitor;

/**
 * Created by eric.manuguerra on 08.09.2014.
 */
public class BoldText implements DocumentElement {

    String text;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

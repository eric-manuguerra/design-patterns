package com.sqli.patterns.visitor;

/**
 * Created by eric.manuguerra on 08.09.2014.
 */
public class Hyperlink implements DocumentElement {

    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

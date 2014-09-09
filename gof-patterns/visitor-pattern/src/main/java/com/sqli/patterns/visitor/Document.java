package com.sqli.patterns.visitor;

import java.util.List;

/**
 * Created by eric.manuguerra on 04.09.2014.
 */
public class Document {

    List<DocumentElement> elements;

    public void accept(Visitor visitor)
    {
        for (DocumentElement element : elements) {
            element.accept(visitor);
        }
    }

    public List<DocumentElement> getElements() {
        return elements;
    }

    public void setElements(List<DocumentElement> elements) {
        this.elements = elements;
    }
}

package com.sqli.patterns.visitor;

/**
 * Created by eric.manuguerra on 04.09.2014.
 */
public interface Visitor {

    void visit(BoldText boldText);
    void visit(ItalicText italicText);
    void visit(Hyperlink hyperlink);



}

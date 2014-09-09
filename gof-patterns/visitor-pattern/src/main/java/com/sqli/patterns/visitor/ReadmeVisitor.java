package com.sqli.patterns.visitor;

/**
 * Created by eric.manuguerra on 08.09.2014.
 */
public class ReadmeVisitor implements Visitor {

    StringBuilder builder = new StringBuilder();

    @Override
    public void visit(BoldText boldText) {
        builder.append("**").append(boldText.getText()).append("**");
    }

    @Override
    public void visit(ItalicText italicText) {
        builder.append("*").append(italicText.getText()).append("*");
    }

    @Override
    public void visit(Hyperlink hyperlink) {
        builder.append("[").append(hyperlink.getUrl()).append("]");
        builder.append("(").append(hyperlink.getUrl()).append(")");
    }

    public StringBuilder getBuilder()
    {
        return builder;
    }
}

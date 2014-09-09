package com.sqli.patterns.visitor;

/**
 * Created by eric.manuguerra on 08.09.2014.
 */
public class HTMLVisitor implements Visitor {

    StringBuilder builder = new StringBuilder();
    
    @Override
    public void visit(BoldText boldText) {
        builder.append("<b>" + boldText.getText() + "</b>");
    }

    @Override
    public void visit(ItalicText italicText) {
        builder.append("<i>" + italicText.getText() + "</i>");
    }

    @Override
    public void visit(Hyperlink hyperlink) {
        builder.append("<a href='").append(hyperlink.getUrl()).append("'>").append(hyperlink.getUrl()).append("</a>");
    }


    public StringBuilder getBuilder()
    {
        return builder;
    }

}

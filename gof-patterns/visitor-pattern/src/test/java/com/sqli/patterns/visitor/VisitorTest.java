package com.sqli.patterns.visitor;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by eric.manuguerra on 08.09.2014.
 */
public class VisitorTest {

    @Test
    public void testVisitor() {

        final BoldText boldText = new BoldText();
        final ItalicText italicText = new ItalicText();
        final Hyperlink hyperlink = new Hyperlink();

        boldText.setText("This is bold");
        italicText.setText("This is italic");
        hyperlink.setUrl("This is a URL");

        final ArrayList<DocumentElement> documentElements = new ArrayList<DocumentElement>();
        documentElements.add(boldText);
        documentElements.add(italicText);
        documentElements.add(hyperlink);

        final Document document = new Document();
        document.setElements(documentElements);

        final HTMLVisitor htmlVisitor = new HTMLVisitor();
        final ReadmeVisitor readmeVisitor = new ReadmeVisitor();

        document.accept(htmlVisitor);
        final StringBuilder builder1 = htmlVisitor.getBuilder();
        System.out.println(builder1.toString());
        document.accept(readmeVisitor);
        final StringBuilder builder2 = readmeVisitor.getBuilder();
        System.out.println(builder2.toString());
    }
}

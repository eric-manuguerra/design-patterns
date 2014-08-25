package com.sqli.patterns.state;

import com.sqli.patterns.state.sample.Document;
import com.sqli.patterns.state.sample.Draft;
import org.junit.Test;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class StateTest {

    @Test
    public void testStatePattern() {
        final Document document = new Document();
        document.setState(new Draft());

        document.promote();
        document.promote();
        document.promote();
    }
}

package com.sqli.patterns;

import com.sqli.patterns.example1.*;
import com.sqli.patterns.example2.CurrencyContext;
import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.config.ConfigParser;
import org.apache.commons.chain.impl.CatalogFactoryBase;
import org.junit.Test;

/**
 * Created by eric.manuguerra on 27.08.2014.
 */
public class CoRTest {

    @Test
    public void testATMHandler() {

        ATMRequestHandler validationHandler = new ValidationHandler();
        ATMRequestHandler handler200 = new Euro200Handler();
        ATMRequestHandler handler100 = new Euro100Handler();
        ATMRequestHandler handler50 = new Euro50Handler();
        ATMRequestHandler handler10 = new Euro10Handler();

        handler200.setNextHandler(handler100);
        handler100.setNextHandler(handler50);
        handler50.setNextHandler(handler10);
        validationHandler.setNextHandler(handler200);

        validationHandler.handleRequest(1510);

        validationHandler.handleRequest(1503);


    }


    @Test
    public void testCommonsChain() throws Exception {
        // Same logic implemented with commons-chain

        final String CONFIG_FILE = "/chain.xml";
        ConfigParser parser = new ConfigParser();
        Catalog catalog;

        parser.parse(
                this.getClass().getResource(CONFIG_FILE));

        catalog = CatalogFactoryBase.getInstance().getCatalog();

        Command command = catalog.getCommand("atm-chain");
        CurrencyContext ctx = new CurrencyContext();
        ctx.setAmount(1510);
        command.execute(ctx);
        ctx.setAmount(1503);
        command.execute(ctx);
    }
}

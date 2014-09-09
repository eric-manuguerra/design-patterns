package com.sqli.patterns.example2;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * Created by eric.manuguerra on 03.09.2014.
 */
public class Euro10Command extends AbstractATMCommand implements Command {

    @Override
    public boolean execute(Context context) throws Exception {
        super.handleRequest((CurrencyContext) context);
        return false;
    }

    @Override
    protected int getValue() {
        return 10;
    }
}

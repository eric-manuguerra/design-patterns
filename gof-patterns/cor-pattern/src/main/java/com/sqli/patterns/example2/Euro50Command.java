package com.sqli.patterns.example2;

import com.sqli.patterns.example1.AbstractATMHandler;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * Created by eric.manuguerra on 03.09.2014.
 */
public class Euro50Command extends AbstractATMCommand implements Command {

    @Override
    public boolean execute(Context context) throws Exception {
        super.handleRequest((CurrencyContext) context);
        return false;
    }

    @Override
    protected int getValue() {
        return 50;
    }
}

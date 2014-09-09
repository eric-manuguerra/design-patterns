package com.sqli.patterns.example2;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * Created by eric.manuguerra on 03.09.2014.
 */
public class ValidationCommand implements Command {

    @Override
    public boolean execute(Context context) throws Exception {

        boolean stopTheChain = false;
        if (((CurrencyContext) context).getAmount() % 10 != 0) {
            System.out.println("This amount can't be handled since it is not a multiple of 10");
            stopTheChain = true;
        }
        return stopTheChain;
    }

}

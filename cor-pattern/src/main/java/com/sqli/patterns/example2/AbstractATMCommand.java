package com.sqli.patterns.example2;

import org.apache.commons.chain.Context;

/**
 * Created by eric.manuguerra on 03.09.2014.
 */
public abstract class AbstractATMCommand {

    public boolean handleRequest(CurrencyContext context) {

        boolean stopTheChain = false;
        final int amount = context.getAmount();
        if (amount >= getValue()) {

            final int nbOfNotes = amount / getValue();
            final int remain = amount % getValue();
            System.out.println("Dispensing " + nbOfNotes + " " + getValue() + " EUR notes");
            if (remain != 0) {
                context.setAmount(remain);
            } else
            {
                stopTheChain = true;
            }

        }

        return stopTheChain;
    }

    protected abstract int getValue();
}

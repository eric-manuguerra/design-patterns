package com.sqli.patterns.example2;

import org.apache.commons.chain.impl.ContextBase;

/**
 * Created by eric.manuguerra on 03.09.2014.
 */
public class CurrencyContext extends ContextBase {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

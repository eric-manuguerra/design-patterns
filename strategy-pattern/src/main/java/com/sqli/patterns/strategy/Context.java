package com.sqli.patterns.strategy;

import java.util.HashMap;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class Context {

    public enum STRATEGY_KEY {
        A, B, C;
    }

    private HashMap<STRATEGY_KEY, Strategy> strategies = new
            HashMap<>();

    public void doExecute(STRATEGY_KEY key) {

        final Strategy strategy = getStrategies().get(key);

        if (strategy != null) {
            strategy.execute();
        }

    }


    public HashMap<STRATEGY_KEY, Strategy> getStrategies() {
        return strategies;
    }

    public void setStrategies(HashMap<STRATEGY_KEY, Strategy> strategies) {
        this.strategies = strategies;
    }
}

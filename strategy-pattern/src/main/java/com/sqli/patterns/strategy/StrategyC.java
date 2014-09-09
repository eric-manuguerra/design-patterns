package com.sqli.patterns.strategy;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class StrategyC implements Strategy {
    @Override
    public void execute() {
        System.out.println("Strategy C executed.");
    }
}

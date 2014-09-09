package com.sqli.patterns.strategy;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class StrategyB implements Strategy {

    @Override
    public void execute() {
        System.out.println("Strategy B executed.");
    }
}

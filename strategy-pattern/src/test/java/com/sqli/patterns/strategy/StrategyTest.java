package com.sqli.patterns.strategy;

import org.junit.Test;

/**
 * Created by eric.manuguerra on 25.08.2014.
 */
public class StrategyTest {

    @Test
    public void testStrategy() {
        final Context context = new Context();
        context.getStrategies().put(Context.STRATEGY_KEY.A, new StrategyA());
        context.getStrategies().put(Context.STRATEGY_KEY.B, new StrategyB());
        context.getStrategies().put(Context.STRATEGY_KEY.C, new StrategyC());

        context.doExecute(Context.STRATEGY_KEY.A);
        context.doExecute(Context.STRATEGY_KEY.B);
        context.doExecute(Context.STRATEGY_KEY.C);

    }

}

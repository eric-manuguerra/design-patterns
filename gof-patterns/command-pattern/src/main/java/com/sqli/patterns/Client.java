package com.sqli.patterns;

/**
 * Created by eric.manuguerra on 29.08.2014.
 */
public class Client {

    void performAction()
    {
        final Receiver receiver = new Receiver();
        Command commandA = new ConcreteCommandA(receiver);
        Command commandB = new ConcreteCommandB(receiver);

        final Invoker invoker = new Invoker();
        invoker.storeAndExecute(commandA);
        invoker.storeAndExecute(commandB);
    }

}

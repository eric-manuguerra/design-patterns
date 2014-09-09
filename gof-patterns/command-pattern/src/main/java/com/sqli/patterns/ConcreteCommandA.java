package com.sqli.patterns;

/**
 * Created by eric.manuguerra on 29.08.2014.
 */
public class ConcreteCommandA implements Command {

    Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionA();
    }



}

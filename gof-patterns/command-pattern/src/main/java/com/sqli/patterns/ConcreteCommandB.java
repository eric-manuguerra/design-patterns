package com.sqli.patterns;

/**
 * Created by eric.manuguerra on 29.08.2014.
 */
public class ConcreteCommandB implements Command {

    Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionB();
    }
}

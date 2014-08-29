package com.sqli.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric.manuguerra on 29.08.2014.
 */
public class Invoker {

    public Invoker() {
    }

    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command command) {
        this.history.add(command);
        command.execute();
    }
}

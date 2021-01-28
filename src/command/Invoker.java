package command;

import command.command.Command;

import java.util.LinkedList;
import java.util.List;

public class Invoker {
    private List<Command> list = new LinkedList<>();

    public Invoker() {
    }

    public void addCommand(Command command) {
        list.add(command);
    }

    public void doCommand() {

    }
}

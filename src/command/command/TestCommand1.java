package command.command;

import command.Receiver;

public class TestCommand1 implements Command {
    private final ConcreteReceiver mReceiver;
    public TestCommand1(ConcreteReceiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action1();
        mReceiver.action2();
    }
}

package command;

public class TestCommand1 implements Command {
    private final Receiver mReceiver;
    public TestCommand1(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action1();
        mReceiver.action2();
    }
}

package command;

public class ConcreteReceiver extends Receiver {
    public ConcreteReceiver() {
    }

    @Override
    protected void action1() {
        System.out.println("do some thing1");
    }

    @Override
    protected void action2() {
        System.out.println("do some thing2");
    }
}

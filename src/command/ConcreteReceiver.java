package command;

public class ConcreteReceiver extends Receiver {
    public ConcreteReceiver() {
    }

    @Override
    public void action1() {
        System.out.println("do some thing1");
    }

    @Override
    public void action2() {
        System.out.println("do some thing2");
    }
}

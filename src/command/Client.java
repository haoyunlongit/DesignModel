package command;

/**
 * Command : 封装了被调用者以及被调用者的行为
 * invoker ：用来管理 Command的业务
 * Receiver ： 具体的执行者
 *
 * 1 调用方只需要获取 invoker的引用
 *
 * 优点 ： 调用方与被调用方解耦
 * 缺点 ： 随着业务的增加，产生新的命令。命令太多
 *
 * 适用于，执行的步骤或者方法有限的情况（遥控器，cpu指令集）
 */

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new ConcreteReceiver();

        //
        Command command = new TestCommand1(receiver);

        //作为参数传给调用方
        Invoker invoker = new Invoker();
        invoker.addCommand(command);
    }
}
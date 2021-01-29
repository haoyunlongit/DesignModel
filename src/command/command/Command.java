package command.command;

/**
 * 封装了被调用者  以及被调用者的行为
 * 核心：将调用者和被调用者解耦
 */
public interface Command {
    void execute();
}

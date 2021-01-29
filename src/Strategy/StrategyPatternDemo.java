package strategy;

import strategy.strategy.OperationAdd;
import strategy.strategy.OperationMultiply;
import strategy.strategy.OperationSubtract;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        context.executeStrategy(100, 200);

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

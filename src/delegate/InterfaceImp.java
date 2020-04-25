package delegate;

public class InterfaceImp implements IInterface {
    @Override
    public void delegateMethod1() {
        System.out.println("===============");
        System.out.println("delegateMethod1");
        System.out.println("===============");
    }

    @Override
    public void delegateMethod2() {
        System.out.println("===============");
        System.out.println("delegateMethod2");
        System.out.println("===============");
    }
}

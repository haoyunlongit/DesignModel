package delegate;

import java.lang.reflect.Proxy;

/**
 *  代理 将真正的实现类封装
 */

public class DelegateClient {
    public static void main(String[] args) {
        ClassLoader loader = InterfaceImp.class.getClassLoader();
        MyProxy temp = new MyProxy(new InterfaceImp());

        IInterface proxy = (IInterface) Proxy.newProxyInstance(loader, new Class[]{IInterface.class}, temp);
        proxy.delegateMethod1();
        proxy.delegateMethod2();
    }
}

package delegate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class MyProxy implements InvocationHandler {
    private IInterface anInterface;

    public MyProxy(IInterface iInterface) {
        anInterface = iInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("~~~proxy Before");
        Object temp = method.invoke(anInterface, args);
        System.out.println("~~~~proxy end");
        return temp;
    }
}

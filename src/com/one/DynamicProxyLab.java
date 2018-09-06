package com.one;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
- 动态代理实验

- Coding By One ON 09/06
*/
public class DynamicProxyLab {
    interface IHello {
        void sayHello();
    }

    static class DynamicHelloProxy implements InvocationHandler {
        private Object object;

        Object getProxy(Object target) {
            object = target;
            Class<?>[] interfaces = target.getClass().getInterfaces();
            return Proxy.newProxyInstance(getClass().getClassLoader(), interfaces,
                    this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("invoke before");
            Object invoke = method.invoke(object, args);
            System.out.println("invoke after");
            return invoke;
        }
    }

    public static void main(String[] args) {
        DynamicHelloProxy dynamicHelloProxy = new DynamicHelloProxy();
        IHello iHello = new IHelloImpl();
        IHello proxy = (IHello) dynamicHelloProxy.getProxy(iHello);
        proxy.sayHello();
        /**
         * invoke before
         * hello word
         * invoke after
         */
    }

}

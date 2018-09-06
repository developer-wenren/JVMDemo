package com.one;

/*
- 

- Coding By One ON 09/06
*/
public class IHelloImpl implements DynamicProxyLab.IHello {
    @Override
    public void sayHello() {
        System.out.println("hello word");
    }
}

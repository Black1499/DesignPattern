package com.lzx.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("跑步准备，系鞋带");
        Object result = method.invoke(object, args);
        System.out.println("跑步完成，拨打120");
        return result;
    }
}

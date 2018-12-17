package com.lzx.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) {
        try {
            long beginTime = System.currentTimeMillis();
            System.out.println("方法的名称：" + method.getName());
            Object object = method.invoke(target, objects);
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - beginTime);
            return object;
        } catch (Exception e) {
            System.out.println("噎死的原因: " + e.getMessage());
        }
        return null;
    }
}

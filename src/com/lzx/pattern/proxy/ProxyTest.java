package com.lzx.pattern.proxy;

import com.lzx.pattern.proxy.cglib.CglibProxy;
import com.lzx.pattern.proxy.cglib.Eat;
import com.lzx.pattern.proxy.dynamic.DynamicProxy;
import com.lzx.pattern.proxy.statics.DoSport;
import com.lzx.pattern.proxy.statics.DoSportProxy;
import com.lzx.pattern.proxy.statics.Sport;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        // 静态代理
        System.out.println("===========静态代理============");
        DoSport doSport = new DoSport();
        DoSportProxy sportProxy = new DoSportProxy(doSport);
        sportProxy.run();

        // 动态代理
        System.out.println("===========动态代理============");
        Sport sport = new DoSport();
        Sport proxySport = (Sport) Proxy.newProxyInstance(Sport.class.getClassLoader(),
                new Class[]{Sport.class},new DynamicProxy(sport));
        proxySport.run();

        // Cglib代理
        System.out.println("===========Cglib代理============");
        Eat eat = new Eat();
        Eat eatProxy = (Eat) new CglibProxy(eat).getInstance();
        eatProxy.eatFoot();
    }
}

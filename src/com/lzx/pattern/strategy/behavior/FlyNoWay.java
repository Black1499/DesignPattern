package com.lzx.pattern.strategy.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞不起来");
    }
}

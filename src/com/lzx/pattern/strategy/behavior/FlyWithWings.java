package com.lzx.pattern.strategy.behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子飞");
    }
}

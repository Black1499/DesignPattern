package com.lzx.pattern.strategy.behavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("叽叽叫");
    }
}

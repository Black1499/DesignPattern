package com.lzx.pattern.strategy.animal;

import com.lzx.pattern.strategy.behavior.FlyWithWings;
import com.lzx.pattern.strategy.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

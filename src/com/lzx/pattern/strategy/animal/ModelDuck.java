package com.lzx.pattern.strategy.animal;

import com.lzx.pattern.strategy.behavior.FlyNoWay;
import com.lzx.pattern.strategy.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("模型鸭");
    }
}

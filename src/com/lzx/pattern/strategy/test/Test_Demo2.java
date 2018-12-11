package com.lzx.pattern.strategy.test;

import com.lzx.pattern.strategy.animal.Duck;
import com.lzx.pattern.strategy.animal.ModelDuck;
import com.lzx.pattern.strategy.behavior.FlyRocketPowered;

public class Test_Demo2 {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuark();
    }
}

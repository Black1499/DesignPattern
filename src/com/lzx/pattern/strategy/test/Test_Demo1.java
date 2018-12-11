package com.lzx.pattern.strategy.test;

import com.lzx.pattern.strategy.animal.Duck;
import com.lzx.pattern.strategy.animal.MallardDuck;

public class Test_Demo1 {
    public static void main(String[] args) {
        Duck mallard =  new MallardDuck();
        mallard.performFly();
        mallard.performQuark();
    }
}

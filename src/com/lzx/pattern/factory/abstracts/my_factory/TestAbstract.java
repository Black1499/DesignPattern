package com.lzx.pattern.factory.abstracts.my_factory;

import com.lzx.pattern.factory.abstracts.my_factory.ComputerFactory;
import com.lzx.pattern.factory.abstracts.my_factory.DellFactory;

public class TestAbstract {
    public static void main(String[] args) {
        ComputerFactory factory = new DellFactory();
        factory.getBrand().printBrand();
        // 电脑键盘
        factory.createdKeyBoard().created();
        // 电脑鼠标
        factory.createdMouse().created();
        factory.createdScreen().created();


        ComputerFactory factory1 = new LenovoFactory();
        factory1.getBrand().printBrand();
        factory1.createdMouse().created();
        factory1.createdKeyBoard().created();
    }
}

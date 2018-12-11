package com.lzx.pattern.factory.abstracts.my_factory;

import com.lzx.pattern.factory.abstracts.my_factory.ComputerFactory;
import com.lzx.pattern.factory.abstracts.my_factory.DellFactory;

public class TestAbstract {
    public static void main(String[] args) {
        ComputerFactory factory = new DellFactory();
        factory.getBrand().printBrand();
        factory.createdKeyBoard().created();
        factory.createdMouse().created();
    }
}

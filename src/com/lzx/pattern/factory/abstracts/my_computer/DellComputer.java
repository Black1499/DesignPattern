package com.lzx.pattern.factory.abstracts.my_computer;

public class DellComputer implements Computer {
    @Override
    public void printBrand() {
        System.out.println("戴尔电脑厂商");
    }
}

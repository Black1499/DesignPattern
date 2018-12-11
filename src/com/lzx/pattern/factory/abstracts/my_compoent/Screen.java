package com.lzx.pattern.factory.abstracts.my_compoent;

public class Screen implements Compoents{
    @Override
    public void created() {
        System.out.println("生产电脑屏幕");
    }
}

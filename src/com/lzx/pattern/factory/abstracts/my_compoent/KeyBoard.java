package com.lzx.pattern.factory.abstracts.my_compoent;

public class KeyBoard implements Compoents {
    @Override
    public void created() {
        System.out.println("生产键盘");
    }
}

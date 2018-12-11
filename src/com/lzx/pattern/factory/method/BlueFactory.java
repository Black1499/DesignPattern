package com.lzx.pattern.factory.method;

import com.lzx.pattern.factory.simple.Blue;
import com.lzx.pattern.factory.simple.Colors;

public class BlueFactory implements ColorMethodFactory {
    @Override
    public Colors getColor(String color) {
        return new Blue();
    }
}

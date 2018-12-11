package com.lzx.pattern.factory.method;


import com.lzx.pattern.factory.simple.Colors;

public interface ColorMethodFactory {
    Colors getColor(String color);
}

package com.lzx.pattern.factory.simple;

/**
 * @author lzx
 * @time 2018-12-11
 */
public class ColorSimpleFactory {
    public static Colors getColor(String color){
        if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }else if(color.equalsIgnoreCase("red")){
            return new Red();
        }else {
            return null;
        }
    }
}

package com.lzx.pattern.factory.abstracts.my_factory;

import com.lzx.pattern.factory.abstracts.my_compoent.KeyBoard;
import com.lzx.pattern.factory.abstracts.my_compoent.Mouse;
import com.lzx.pattern.factory.abstracts.my_computer.Computer;

public abstract class ComputerFactory {
    abstract Mouse createdMouse();
    abstract KeyBoard createdKeyBoard();

    abstract Computer getBrand();
}

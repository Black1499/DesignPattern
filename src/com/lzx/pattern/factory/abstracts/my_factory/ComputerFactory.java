package com.lzx.pattern.factory.abstracts.my_factory;

import com.lzx.pattern.factory.abstracts.my_compoent.Compoents;
import com.lzx.pattern.factory.abstracts.my_computer.Computer;

public interface ComputerFactory {
    Compoents createdMouse();

    Compoents createdKeyBoard();

    Compoents createdScreen();

    Computer getBrand();
}

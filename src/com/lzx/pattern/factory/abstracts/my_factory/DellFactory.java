package com.lzx.pattern.factory.abstracts.my_factory;

import com.lzx.pattern.factory.abstracts.my_compoent.Compoents;
import com.lzx.pattern.factory.abstracts.my_compoent.KeyBoard;
import com.lzx.pattern.factory.abstracts.my_compoent.Mouse;
import com.lzx.pattern.factory.abstracts.my_compoent.Screen;
import com.lzx.pattern.factory.abstracts.my_computer.Computer;
import com.lzx.pattern.factory.abstracts.my_computer.DellComputer;

public class DellFactory implements ComputerFactory {
    @Override
    public Compoents createdMouse() {
        return new Mouse();
    }

    @Override
    public Compoents createdKeyBoard() {
        return new KeyBoard();
    }

    @Override
    public Compoents createdScreen() {
        return new Screen();
    }

    @Override
    public Computer getBrand() {
        return new DellComputer();
    }
}

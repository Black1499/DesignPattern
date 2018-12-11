package com.lzx.pattern.factory.abstracts.my_factory;

import com.lzx.pattern.factory.abstracts.my_compoent.KeyBoard;
import com.lzx.pattern.factory.abstracts.my_compoent.Mouse;
import com.lzx.pattern.factory.abstracts.my_computer.Computer;
import com.lzx.pattern.factory.abstracts.my_computer.DellComputer;

public class DellFactory extends ComputerFactory {
    @Override
    Mouse createdMouse() {
        return new Mouse();
    }

    @Override
    KeyBoard createdKeyBoard() {
        return new KeyBoard();
    }

    @Override
    Computer getBrand() {
        return new DellComputer();
    }
}

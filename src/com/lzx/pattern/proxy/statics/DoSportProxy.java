package com.lzx.pattern.proxy.statics;

public class DoSportProxy implements Sport {
    private Sport sport;

    public DoSportProxy(Sport sport) {
        this.sport = sport;
    }

    @Override
    public void run() {
        System.out.println("啦啦啦，我是跑步的小行家");
        sport.run();
    }
}

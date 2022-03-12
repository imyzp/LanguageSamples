package com.yzp.design._n静态代理模式.model;

import com.yzp.design._n静态代理模式.interfaces.Marry;

public class Yzp implements Marry {
    @Override
    public void HappyMarry() {
        System.out.println("我要结婚了，超开心");
    }
}

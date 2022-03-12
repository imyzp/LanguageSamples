package com.yzp.design._n静态代理模式.model;

import com.yzp.design._n静态代理模式.interfaces.Marry;

public class WeddingCompany implements Marry {
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚后，收尾款");
    }

    private void before() {
        System.out.println("结婚前，布置现场，收押金");
    }
}

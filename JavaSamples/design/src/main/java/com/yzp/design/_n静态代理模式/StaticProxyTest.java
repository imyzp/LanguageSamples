package com.yzp.design._n静态代理模式;

import com.yzp.design._n静态代理模式.model.WeddingCompany;
import com.yzp.design._n静态代理模式.model.Yzp;

/**
 * 总结：真实对象和代理对象都要实现同一个接口，代理对象要代理真实角色
 * 好处：代理对象可以做很多真实对象做不了的事情
 *      真实对象专注做自己的事情
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Yzp yzp = new Yzp();
        WeddingCompany weddingCompany = new WeddingCompany(yzp);
        weddingCompany.HappyMarry();
    }
}

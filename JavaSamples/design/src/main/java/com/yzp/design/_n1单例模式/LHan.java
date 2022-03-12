package com.yzp.design._n1单例模式;

/**
 * 懒汉式
 */
public class LHan {
    private static LHan instance;
    // 私有构造方法
    private LHan(){}
    public static LHan getInstance(){
        if(instance == null)
        {
            instance = new LHan();
        }
        return instance;
    }
}

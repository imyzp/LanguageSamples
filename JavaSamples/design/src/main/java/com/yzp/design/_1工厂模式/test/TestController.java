package com.yzp.design._1工厂模式.test;

import com.yzp.design._1工厂模式.services.OperationFactory;

/**
 * @ProjectName LanguageSamples
 * @Description TODO
 * @Author yaozhenpeng
 * @Time 2022/1/12 23:21
 */
public class TestController {
    public static void main(String[] args) {
        // 传入不同类型从工厂创造不同对象
        OperationFactory.createOperation(1);
    }
}

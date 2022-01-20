package com.yzp.design._1工厂模式.简单工厂.test;

import com.yzp.design._1工厂模式.简单工厂.model.Product;
import com.yzp.design._1工厂模式.简单工厂.services.SimpleFactory;

/**
 * @ProjectName LanguageSamples
 * @Description TODO
 * @Author yaozhenpeng
 * @Time 2022/1/12 23:21
 */
public class TestController {
    public static void main(String[] args) {
        // 传入不同类型从工厂创造不同对象
        Product product = SimpleFactory.createProduct(1);
        product.method1();
    }
}

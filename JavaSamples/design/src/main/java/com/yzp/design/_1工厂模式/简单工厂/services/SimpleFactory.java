package com.yzp.design._1工厂模式.简单工厂.services;

import com.yzp.design._1工厂模式.简单工厂.model.Product;
import com.yzp.design._1工厂模式.简单工厂.model.Product1;
import com.yzp.design._1工厂模式.简单工厂.model.Product2;
import com.yzp.design._1工厂模式.简单工厂.model.Product3;

/**
 * @ProjectName LanguageSamples
 * @Description 工厂
 * @Author yaozhenpeng
 * @Time 2022/1/12 23:25
 */
public class SimpleFactory {
    public static Product createProduct(int type){
        Product operation = null;
        switch (type)
        {
            case 1:
                operation = new Product1();
                break;
            case 2:
                operation = new Product2();
                break;
            case 3:
                operation = new Product3();
                break;
            default:
                break;
        }
        return operation;
    }
}

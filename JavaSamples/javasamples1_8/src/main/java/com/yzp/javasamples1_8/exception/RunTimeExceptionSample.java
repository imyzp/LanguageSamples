package com.yzp.javasamples1_8.exception;

import org.junit.Assert;

public class RunTimeExceptionSample {
    public static void main(String[] args) {
        System.out.println("异常抛出使用场景");

        // 一 模拟调用方，没用按照规范来传参数
        try {
            method1("dd");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    static void method1(String number) throws IllegalAccessException {
        Assert.assertNotNull(null);

        int temperature = 0;

        try {
            if (number.length() > 0) {
                temperature = Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
            throw new IllegalAccessException("Must enter integer , number=" + number + "  " + e);
        }
        // 其它业务
    }
}

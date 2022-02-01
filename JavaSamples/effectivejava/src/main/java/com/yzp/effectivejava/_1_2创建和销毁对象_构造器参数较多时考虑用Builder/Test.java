package com.yzp.effectivejava._1_2创建和销毁对象_构造器参数较多时考虑用Builder;

public class Test {
    public static void main(String[] args) {
        Cat builder = new Cat.CatBuilder().id(1).name("huahua").color("red").builder();

    }
}

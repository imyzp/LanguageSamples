package com.yzp.effectivejava._1_1创建和销毁对象_静态方法代替构造器;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName LanguageSamples
 * @Description
 * 好处：
 * --------静态方法可以处理构造行为
 * 1、单例模式
 * 2、只允许同name的创建一个对象
 * 3、可以返回子类型，而构造器只能返回自身的新实例
 * @Author yaozhenpeng
 * @Time 2022/1/21 20:11
 */
public class Cat {
    private static Cat cat = new Cat();
    private static Map<String,Cat> catMap = new HashMap<>();
    private static Cat homeCat = new HomeCat();

    // 1、单例模式
    public static Cat getInstance(){
        return cat;
    }
    // 2、只允许同name的创建一个对象
    public static Cat getOnceNameInstance(String name){
        return catMap.computeIfAbsent(name, n->new Cat(1,n));
    }
//    3、可以返回子类型，而构造器只能返回自身的新实例
    public static Cat getHomeCat(){
        return homeCat;
    }




    private Integer id;
    private String name;

    public Cat() {
    }

    private Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

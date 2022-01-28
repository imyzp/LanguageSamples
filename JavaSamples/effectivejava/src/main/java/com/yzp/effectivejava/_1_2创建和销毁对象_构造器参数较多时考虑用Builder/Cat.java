package com.yzp.effectivejava._1_2创建和销毁对象_构造器参数较多时考虑用Builder;

import java.time.LocalDateTime;

/**
 * @ProjectName LanguageSamples
 * @Description TODO
 * @Author yaozhenpeng
 * @Time 2022/1/27 20:22
 */
public class Cat {
    private final Integer id;// id是必须的，且是唯一标识
    private String name; // name是可变的，而且可以为null
    private final String color; // color 必须,且不变
    private final LocalDateTime birthday;// 必须，且不变
    private Integer user_id;// 他的主人，可变，可Null

    public Cat() {
        this.id = 0;
        this.color = "white";
        this.birthday = LocalDateTime.now();
    }

    public Cat(Integer id, String name, String color, LocalDateTime birthday, Integer user_id) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthday = birthday;
        this.user_id = user_id;
    }

    public static class CatBuilder{
        private Integer id;// id是必须的，且是唯一标识
        private String name; // name是可变的，而且可以为null
        private String color; // color 必须
        private LocalDateTime birthday;// 必须，且不变
        private Integer user_id;// 他的主人，可变，可Null

        public CatBuilder id(Integer id){
            this.id = id;
            return this;
        }

        public CatBuilder name(String name){
            this.name = name;
            return this;
        }

        public CatBuilder color(String color){
            this.color = color;
            return this;
        }

        public CatBuilder birthday(LocalDateTime birthday){
            this.birthday = birthday;
            return this;
        }

        public CatBuilder birthday(Integer user_id){
            this.user_id = user_id;
            return this;
        }

    }
}

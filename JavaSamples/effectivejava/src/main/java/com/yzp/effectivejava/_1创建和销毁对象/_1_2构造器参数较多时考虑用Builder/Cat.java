package com.yzp.effectivejava._1创建和销毁对象._1_2构造器参数较多时考虑用Builder;

import java.time.LocalDateTime;

/**
 * @ProjectName LanguageSamples
 * @Description 创建和销毁对象，对象参数较多时考虑用Builder
 *  随着构造参数的增多，需要实例时构造器就会急速膨胀，此时用Builder可以非常灵活地构建对象，我们当然
 *  可以用setter来处理，但我们希望有些属性成为final,一旦创建实例就不再改变，如id,这时候就体现了Builder。
 *
 *  1、拥有final类型的属性的对象，该字段就是线程安全的。
 *  2、在设置值时对公共需要校验的参数，可以统一写在builder里
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
        public Cat builder(){
            if(id == null){
                throw new IllegalArgumentException("id is null");
            }
            if(color == null){
                throw new IllegalArgumentException("color is null");
            }
            if(birthday == null){
                throw new IllegalArgumentException("birthday is null");
            }
            return new Cat(id,name,color,birthday,user_id);
        }

    }
}

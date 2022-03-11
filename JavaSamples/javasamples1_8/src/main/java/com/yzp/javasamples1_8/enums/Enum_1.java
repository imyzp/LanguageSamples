package com.yzp.javasamples1_8.enums;

/**
 * 枚举类也可以定义相应方法
 */
public  enum Enum_1 {
    EX_1(1,"截图","img"){
        @Override
        public void uploadFile(){
            // todo something
        }
    },
    EX_2(2,"图标","icon"){
        @Override
        public void uploadFile(){
            // todo something
        }
    },
    EX_3(3,"文件","file"){
        @Override
        public void uploadFile(){
            // todo something
        }
    };
    private Integer type;
    private String name;
    private String code;

    Enum_1(Integer type, String name, String code) {
        this.type = type;
        this.name = name;
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public Enum_1 setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public Enum_1 setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Enum_1 setCode(String code) {
        this.code = code;
        return this;
    }

    public abstract void uploadFile();
}

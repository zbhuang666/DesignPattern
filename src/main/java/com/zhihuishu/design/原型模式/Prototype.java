package com.zhihuishu.design.原型模式;

public class Prototype implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

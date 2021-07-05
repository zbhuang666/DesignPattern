package com.zhihuishu.design.结构型模式.桥接模式;

public class Man extends Person{
    public Man() {
        setType("男人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}

package com.zhihuishu.design.结构型模式.桥接模式;

public class Lady extends Person{

    public Lady() {
        setType("女士");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}

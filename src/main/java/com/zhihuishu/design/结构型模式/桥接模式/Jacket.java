package com.zhihuishu.design.结构型模式.桥接模式;

public class Jacket extends Clothing{
    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿马甲");
    }
}

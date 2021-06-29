package com.zhihuishu.design.抽象工厂模式;

public class BlackCat implements ICat{
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
}

package com.zhihuishu.design.结构型模式.装饰模式;

public class ManDecoratorA extends Decorator{

    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public void reEat() { System.out.println("再吃一顿饭"); }
}

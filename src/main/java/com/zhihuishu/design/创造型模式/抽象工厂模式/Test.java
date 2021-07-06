package com.zhihuishu.design.创造型模式.抽象工厂模式;

/**
 * 一、概述：
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *二、为何使用
 * 工厂模式是我们最常用的模式了,著名的Jive论坛 ,就大量使用了工厂模式，工厂模式在Java程序系统可以
 * 说是随处可见。
 * 为什么工厂模式是如此常用？因为工厂模式就相当于创建实例对象的new，我们经常要根据类Class生
 * 成实例对象，如A a=new A() 工厂模式也是用来创建实例对象的，所以以后new时就要多个心眼，是否
 * 可以考虑实用工厂模式，虽然这样做，可能多做一些工作，但会给你系统带来更大的可扩展性和尽量少
 * 的修改量
 * 三、实用性
 * 一个系统要独立于它的产品的创建、组合和表示时。
 * 一个系统要由多个产品系列中的一个来配置时。
 * 当你要强调一系列相关的产品对象的设计以便进行联合使用时。
 * 当你提供一个产品类库，而只想显示它们的接口而不是实现时。
 * 四、参与者
 * AbstractFactory 声明一个创建抽象产品对象的操作接口。
 * ConcreteFactory 实现创建具体产品对象的操作。
 * AbstractProduct 为一类产品对象声明一个接口。
 * ConcreteProduct 定义一个将被相应的具体工厂创建的产品对象。 实现AbstractProduct接口。
 * Client 仅使用由AbstractFactory和AbstractProduct类声明的接口
 */
public class Test {

    public static void main(String[] args) {
        IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        ICat blackCat = blackAnimalFactory.createCat();
        blackCat.eat();
        IDog blackDog = blackAnimalFactory.createDog();
        blackDog.eat();
        IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        ICat whiteCat = whiteAnimalFactory.createCat();
        whiteCat.eat();
        IDog whiteDog = whiteAnimalFactory.createDog();
        whiteDog.eat();
    }
}

package com.zhihuishu.design.结构型模式.装饰模式;

/**
 * 一、概述
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。
 *二、适用性
 * 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
 * 处理那些可以撤消的职责。
 * 当不能采用生成子类的方法进行扩充时。
 * 三、参与者
 * Component 定义一个对象接口，可以给这些对象动态地添加职责
 * ConcreteComponent 定义一个对象，可以给这个对象添加一些职责。
 * Decorator 维持一个指向Component对象的指针，并定义一个与Component接口一致的接口。
 * ConcreteDecorator 向组件添加职责
 */
public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();
        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }
}

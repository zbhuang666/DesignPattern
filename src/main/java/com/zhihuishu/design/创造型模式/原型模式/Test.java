package com.zhihuishu.design.创造型模式.原型模式;

/**
 * 一、概述
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 二、适用性
 * 当一个系统应该独立于它的产品创建、构成和表示时。
 * 当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 * 为了避免创建一个与产品类层次平行的工厂类层次时。
 * 当一个类的实例只能有几个不同状态组合中的一种时。
 * 建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 * 三、参与者
 * Prototype 声明一个克隆自身的接口。
 * ConcretePrototype 实现一个克隆自身的操作。
 * Client 让一个原型克隆自身从而创建一个新的对象。
 */
public class Test {
    public static void main(String[] args) {
        try {
            Prototype prototype = new ConcretePrototype("Prototype");
            Prototype prototype2 = (Prototype)prototype.clone();
            System.out.println(prototype.getName());
            System.out.println(prototype2.getName());
            System.out.println(prototype == prototype2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

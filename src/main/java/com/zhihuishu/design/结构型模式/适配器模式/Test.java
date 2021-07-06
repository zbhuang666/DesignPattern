package com.zhihuishu.design.结构型模式.适配器模式;

/**
 * 一、概述
 * 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工
 * 作的那些类可以一起工作。
 * 二、适用性
 * 使用一个已经存在的类，而它的接口不符合你的需求。
 * 创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口 可能不一定兼
 * 容的类）协同工作。
 * （仅适用于对象Adapter）使用一些已经存在的子类，但是不可能对每一个都进行 子类化以匹配它
 * 们的接口。对象适配器可以适配它的父类接口。
 * 三、参与者
 * Target 定义Client使用的与特定领域相关的接口。
 * Client 与符合Target接口的对象协同。
 * Adaptee 定义一个已经存在的接口，这个接口需要适配。
 * Adapter 对Adaptee的接口与Target接口进行适配
 */
public class Test {

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.adapterMethod();
        adapter.adapteeMethod();
    }
}

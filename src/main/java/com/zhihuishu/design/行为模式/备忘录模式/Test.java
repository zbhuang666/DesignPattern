package com.zhihuishu.design.行为模式.备忘录模式;

/**
 * 一、概述
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将
 * 该对象恢复到原先保存的状态。
 * 二、适用性
 * 必须保存一个对象在某一个时刻的(部分)状态,这样以后需要时它才能恢复到先前的状态。
 * 如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。
 * 三、参与者
 * Memento 备忘录存储原发器对象的内部状态。
 * Originator 原发器创建一个备忘录,用以记录当前时刻它的内部状态。 使用备忘录恢复内部状态.
 * Caretaker 负责保存好备忘录。 不能对备忘录的内容进行操作或检查。
 */
public class Test {
    public static void main(String[] args) {
        Originator org = new Originator();
        org.setState("开会中");
        Caretaker ctk = new Caretaker();
        ctk.setMemento(org.createMemento());
        //将数据封装在Caretaker
        org.setState("睡觉中");
        org.showState();
        //显示
        org.setMemento(ctk.getMemento());
        //将数据重新导入
        org.showState();
    }
}

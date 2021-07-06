package com.zhihuishu.design.行为模式.备忘录模式;

public class Caretaker {
    private Memento memento;
    public Memento getMemento(){ return this.memento; }
    public void setMemento(Memento memento){ this.memento = memento; }
}

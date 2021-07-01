package com.zhihuishu.design.结构型模式.装饰模式;

public abstract class Decorator implements Person{
    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void eat(){
        person.eat();
    }
}

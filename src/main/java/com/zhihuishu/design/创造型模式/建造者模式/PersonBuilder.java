package com.zhihuishu.design.创造型模式.建造者模式;

public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}

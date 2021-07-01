package com.zhihuishu.design.创造型模式.工厂方法模式;

public class StudentWorkFactory implements IWorkFactory{
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}

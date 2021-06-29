package com.zhihuishu.design.工厂方法模式;

public class TeacherWorkFactory implements IWorkFactory{
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}

package com.zhihuishu.design.工厂方法模式;

public class TeacherWork implements Work{

    @Override
    public void doWork() {
        System.out.println("老师审批作业!");
    }
}

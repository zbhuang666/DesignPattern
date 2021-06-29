package com.zhihuishu.design.工厂方法模式;

public class StudentWork implements Work{
    @Override
    public void doWork() {
        System.out.println("学生做作业!");
    }
}

package com.zhihuishu.design.结构型模式.代理模式;

public class SubjectImpl implements Subject{
    @Override
    public void action() {
        System.out.println("这是代理类");
    }
}

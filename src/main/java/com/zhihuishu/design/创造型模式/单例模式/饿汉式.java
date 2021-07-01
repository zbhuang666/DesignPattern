package com.zhihuishu.design.创造型模式.单例模式;

public class 饿汉式 {
    public static 饿汉式 instance = null;
    public 饿汉式() {
    }
    static {
        instance = new 饿汉式();
    }
    public static 饿汉式 getInstance(){
        return instance;
    }
}

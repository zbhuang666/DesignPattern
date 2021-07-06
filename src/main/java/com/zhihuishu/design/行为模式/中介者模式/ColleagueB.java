package com.zhihuishu.design.行为模式.中介者模式;

public class ColleagueB implements Colleague{
    @Override
    public void action() {
        System.out.println("前台注意了!");
    }
}

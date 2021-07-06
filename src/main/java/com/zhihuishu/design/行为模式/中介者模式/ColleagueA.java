package com.zhihuishu.design.行为模式.中介者模式;

public class ColleagueA implements Colleague {
    @Override
    public void action() {
        System.out.println("普通员工努力工作");
    }
}

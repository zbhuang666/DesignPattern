package com.zhihuishu.design.结构型模式.组合模式;

/**
 * 程序员
 */
public class Programmer extends Employer{

    public Programmer(String name) {
        setName(name);
        employers = null;
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}

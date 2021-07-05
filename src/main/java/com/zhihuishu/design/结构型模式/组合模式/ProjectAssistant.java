package com.zhihuishu.design.结构型模式.组合模式;

/**
 * 项目助理
 */
public class ProjectAssistant extends Employer{
    public ProjectAssistant(String name) {
        setName(name);
        this.employers = null;
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}

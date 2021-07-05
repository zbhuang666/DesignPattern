package com.zhihuishu.design.结构型模式.组合模式;

import java.util.ArrayList;

/**
 * 项目经理
 */
public class ProjectManager extends Employer{
    public ProjectManager(String name) {
        setName(name);
        this.employers = new ArrayList<>();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.add(employer);
    }
}

package com.zhihuishu.design.行为模式.访问者模式;

public interface Visitable {
    public void accept(Visitor visitor);
}

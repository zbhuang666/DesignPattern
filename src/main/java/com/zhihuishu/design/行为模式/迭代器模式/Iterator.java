package com.zhihuishu.design.行为模式.迭代器模式;

public interface Iterator {
    Object next();
    void first();
    void last();
    boolean hasNext();
}

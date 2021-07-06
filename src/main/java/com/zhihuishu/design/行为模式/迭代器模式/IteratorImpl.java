package com.zhihuishu.design.行为模式.迭代器模式;


public class IteratorImpl implements Iterator{
    private List list;
    private int index;
    public IteratorImpl(List list) {
        this.list = list;
        index = 0;
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = list.getSize();
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }
}

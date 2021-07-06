package com.zhihuishu.design.行为模式.模板方法;

public class TemplateConcrete extends Template{
    @Override
    public void print() {
        System.out.println("这是子类的实现");
    }
}

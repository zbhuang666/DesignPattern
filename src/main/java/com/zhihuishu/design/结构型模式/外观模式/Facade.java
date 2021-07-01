package com.zhihuishu.design.结构型模式.外观模式;

public class Facade {
    ServiceA sa;
    ServiceB sb;
    ServiceC sc;
    public Facade() { sa = new ServiceAImpl(); sb = new ServiceBImpl(); sc = new ServiceCImpl(); }
    public void methodA() { sa.methodA(); sb.methodB(); }
    public void methodB() { sb.methodB(); sc.methodC(); }
    public void methodC() { sc.methodC(); sa.methodA(); }
}

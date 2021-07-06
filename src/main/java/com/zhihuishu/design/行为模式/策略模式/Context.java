package com.zhihuishu.design.行为模式.策略模式;

public class Context {
    Strategy stra;
    public Context(Strategy stra) { this.stra = stra; }
    public void doMethod() { stra.method(); }
}

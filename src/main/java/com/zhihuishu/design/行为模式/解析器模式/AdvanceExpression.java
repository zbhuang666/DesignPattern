package com.zhihuishu.design.行为模式.解析器模式;

public class AdvanceExpression extends Expression{
    @Override
    void interpret(Context ctx) {
        System.out.println("这是高级解析器!");
    }
}

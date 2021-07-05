package com.zhihuishu.design.行为模式.解析器模式;

public class SimpleExpression extends Expression{
    @Override
    void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}

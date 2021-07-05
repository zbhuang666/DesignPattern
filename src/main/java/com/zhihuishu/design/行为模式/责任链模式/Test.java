package com.zhihuishu.design.行为模式.责任链模式;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;

/**
 * 二、适用性
 * 有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
 * 在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 * 可处理一个请求的对象集合应被动态指定。
 * 三、参与者
 * Handler 定义一个处理请求的接口。 （可选）实现后继链。
 * ConcreteHandler 处理它所负责的请求。 可访问它的后继者。 如果可处理该请求，就处理之；否
 * 则将该请求转发给它的后继者。
 * Client 向链上的具体处理者(ConcreteHandler)对象提交请求。
 */
public class Test {
    public static void main(String[] args) {
        RequestHandle hr = new HRRequestHandle();
        RequestHandle pm = new PMRequestHandle(hr);
        RequestHandle tl = new TLRequestHandle(pm);
        //team leader处理离职请求
        UserRequest request = new LeaveRequest();
        tl.handleRequest(request);
        System.out.println("===========");
        //team leader处理加薪请求
        request = new AddMoneyRequest();
        tl.handleRequest(request);
        System.out.println("========");
        //项目经理上理辞职请求
        request = new DimissionRequest();
        pm.handleRequest(request);
    }
}

package com.zhihuishu.design.行为模式.责任链模式;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;

/**
 * 一、概述
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条
 * 链， 并沿着这条链传递该请求，直到有一个对象处理它为止。 这一模式的想法是，给多个对象处理一
 * 个请求的机会，从而解耦发送者和接受者。
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

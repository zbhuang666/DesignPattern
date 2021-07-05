package com.zhihuishu.design.行为模式.责任链模式;

import org.omg.CORBA.Request;

public class HRRequestHandle implements RequestHandle{
    @Override
    public void handleRequest(UserRequest request) {
        if (request instanceof DimissionRequest) { System.out.println("要离职, 人事审批!"); }
        System.out.println("请求完毕");
    }
}

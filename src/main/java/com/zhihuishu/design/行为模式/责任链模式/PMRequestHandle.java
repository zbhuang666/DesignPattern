package com.zhihuishu.design.行为模式.责任链模式;

import org.omg.CORBA.Request;

public class PMRequestHandle implements RequestHandle{
    RequestHandle hr;

    public PMRequestHandle(RequestHandle hr) {
        this.hr = hr;
    }

    @Override
    public void handleRequest(UserRequest request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("要加薪, 项目经理审批!");
        } else { hr.handleRequest(request); }
    }
}

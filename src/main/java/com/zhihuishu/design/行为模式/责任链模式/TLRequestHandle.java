package com.zhihuishu.design.行为模式.责任链模式;

import org.omg.CORBA.Request;

public class TLRequestHandle implements RequestHandle{
    RequestHandle pm;

    public TLRequestHandle(RequestHandle pm) {
        this.pm = pm;
    }

    @Override
    public void handleRequest(UserRequest request) {
        if (request instanceof LeaveRequest) {
            System.out.println("要请假, 项目组长审批!");
        } else { pm.handleRequest(request); }
    }
}

package com.zhihuishu.design.行为模式.责任链模式;

import org.omg.CORBA.Request;

public interface RequestHandle {
    void handleRequest(UserRequest request);
}

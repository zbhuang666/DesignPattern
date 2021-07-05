package com.zhihuishu.design.行为模式.命令模式;

/**
 * 二、适用性
 * 抽象出待执行的动作以参数化某对象。
 * 在不同的时刻指定、排列和执行请求。
 * 支持取消操作。
 * 支持修改日志，这样当系统崩溃时，这些修改可以被重做一遍。
 * 用构建在原语操作上的高层操作构造一个系统。
 * 三、参与者
 * Command 声明执行操作的接口。
 * ConcreteCommand 将一个接收者对象绑定于一个动作。 调用接收者相应的操作，以实现
 * Execute。
 * Client 创建一个具体命令对象并设定它的接收者。
 * Invoker 要求该命令执行这个请求。
 * Receiver 知道如何实施与执行一个请求相关的操作。任何类都可能作为一个接收者。
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommandImpl command = new CommandImpl(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.execute();
    }
}

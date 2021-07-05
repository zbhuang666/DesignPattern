package com.zhihuishu.design.行为模式.命令模式;

public class Invoker {
    private Command command;
    public void setCommand(Command command) { this.command = command; }
    public void execute() { command.execute(); }
}

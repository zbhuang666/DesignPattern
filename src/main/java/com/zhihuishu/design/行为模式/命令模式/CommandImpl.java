package com.zhihuishu.design.行为模式.命令模式;

public class CommandImpl extends Command{

    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}

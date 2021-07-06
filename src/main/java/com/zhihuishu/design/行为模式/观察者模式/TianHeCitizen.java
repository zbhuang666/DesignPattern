package com.zhihuishu.design.行为模式.观察者模式;

public class TianHeCitizen extends Citizen{
    public TianHeCitizen(Policeman pol) { setPolicemen(); register(pol); }
    @Override
    void sendMessage(String help) {
        setHelp(help);
        for (int i = 0; i < pols.size(); i++) {
            Policeman pol = pols.get(i);
            //通知警察行动
            pol.action(this);
        }
    }
}

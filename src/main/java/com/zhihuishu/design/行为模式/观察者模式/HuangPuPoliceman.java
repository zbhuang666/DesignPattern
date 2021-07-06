package com.zhihuishu.design.行为模式.观察者模式;

public class HuangPuPoliceman implements Policeman{
    @Override
    public void action(Citizen ci) {
        String help = ci.getHelp();
        if (help.equals("normal")) { System.out.println("一切正常, 不用出动"); }
        if (help.equals("unnormal")) { System.out.println("有犯罪行为, 黄埔警察出动!"); }
    }
}

package com.zhihuishu.design.行为模式.状态模式;

public class Rain implements Weather{
    @Override
    public String getWeather() {
        return "下雨";
    }
}

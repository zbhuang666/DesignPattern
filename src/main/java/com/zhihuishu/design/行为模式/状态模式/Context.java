package com.zhihuishu.design.行为模式.状态模式;

public class Context {
    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage() { return weather.getWeather(); }
}

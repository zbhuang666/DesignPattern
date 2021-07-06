package com.zhihuishu.design.行为模式.访问者模式;

public class FloatElement implements Visitable{
    private Float fe;
    public FloatElement(Float fe) { this.fe = fe; }
    public Float getFe() { return this.fe; }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}

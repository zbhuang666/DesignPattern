package com.zhihuishu.design.行为模式.访问者模式;

import java.util.Collection;

public interface Visitor {
    public void visitString(StringElement stringE);
    public void visitFloat(FloatElement floatE);
    public void visitCollection(Collection collection);
}

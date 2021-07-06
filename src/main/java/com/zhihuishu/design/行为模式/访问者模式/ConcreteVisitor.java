package com.zhihuishu.design.行为模式.访问者模式;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visitString(StringElement stringE) {
        System.out.println(stringE.getSe());
    }

    @Override
    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getFe());
    }

    @Override
    public void visitCollection(Collection collection) {
        // TODO Auto-generated method stub
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) { Object o = iterator.next();
        if (o instanceof Visitable) { ((Visitable)o).accept(this); } }
    }
}

package com.zhihuishu.design.创造型模式.抽象工厂模式;

public class WhiteAnimalFactory implements IAnimalFactory{
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}

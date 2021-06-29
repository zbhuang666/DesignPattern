package com.zhihuishu.design.抽象工厂模式;

public class BlackAnimalFactory implements IAnimalFactory{
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}

package com.zhihuishu.design.单例模式;

public class 枚举 {

    public 枚举() {
    }

    public static 枚举 getInstance() {
        return SingleTon.INSTANCE.getInstance();
    }

    private enum SingleTon {
        INSTANCE;
        private 枚举 instance;
        //JVM保证这个方法绝对只调用一次
        SingleTon() {
            instance = new 枚举();
        }
        public 枚举 getInstance() {
            return instance;
        }
    }
}

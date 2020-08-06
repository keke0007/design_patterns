package com.designpattern.pattern.creational._05_singleton;

/**
 * 单例设计模式-Enum枚举单例
 */
public enum _05_EnumInstance {
    INSTANCE{
        protected void printTest() {
            System.out.println("Print Test");
        }
    };

    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static _05_EnumInstance getInstance() {
        return INSTANCE;
    }
}

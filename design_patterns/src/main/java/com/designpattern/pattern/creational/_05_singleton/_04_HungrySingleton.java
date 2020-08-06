package com.designpattern.pattern.creational._05_singleton;

import java.io.Serializable;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/8/6 17:02
 *
 * 单例设计模式-饿汉式
 */
public class _04_HungrySingleton implements Serializable,Cloneable {
    private final static _04_HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new _04_HungrySingleton();
    }

    public _04_HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static _04_HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}

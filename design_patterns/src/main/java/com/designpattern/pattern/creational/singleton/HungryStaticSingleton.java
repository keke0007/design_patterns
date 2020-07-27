package com.designpattern.pattern.creational.singleton;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/27 11:03
 */

/**
 * 饿汉式单例模式: 静态代码块
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}

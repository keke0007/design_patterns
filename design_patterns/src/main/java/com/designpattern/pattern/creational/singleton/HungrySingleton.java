package com.designpattern.pattern.creational.singleton;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/27 11:00
 */

/**
 * 饿汉式单例模式
 */
public class HungrySingleton {
    //先静态,后动态
    //先属性,后方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}

package com.designpattern.pattern.creational._05_singleton;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/8/6 16:28
 *
 * 单例设计模式-懒汉式
 */
public class _01_LazySingleton {

    private static _01_LazySingleton lazySingleton = null;

    private  _01_LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static _01_LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new _01_LazySingleton();
        }
        return lazySingleton;
    }
}

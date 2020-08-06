package com.designpattern.pattern.creational._05_singleton;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/8/6 16:56
 *
 * 单例设计模式-静态内部类-基于类初始化的延迟加载解决方案
 */
public class _03_StaticInnerClassSingleton {

    public _03_StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass {
        private static _03_StaticInnerClassSingleton staticInnerClassSingleton = new _03_StaticInnerClassSingleton();
    }

    public static _03_StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

}

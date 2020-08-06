package com.designpattern.pattern.creational._05_singleton;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/8/6 16:50
 *
 * 单例设计模式-DoubleCheck双重检查
 */
public class _02_LazyDoubleCheckSingleton {

    private volatile static _02_LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private  _02_LazyDoubleCheckSingleton() {
    }

    public static _02_LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (_02_LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new _02_LazyDoubleCheckSingleton();
                    //new 操作
                    //1. 分配内存给这个对象
                    //3. 设置lazyDoubleCheckSingleton指向刚分配的内存地址
                    //2. 初始化对象
                    // intra-thread samantics
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}

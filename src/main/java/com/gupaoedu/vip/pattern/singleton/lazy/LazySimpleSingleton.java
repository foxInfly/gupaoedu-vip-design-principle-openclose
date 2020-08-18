package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * 优点：节省了内存
 * 缺点：线程不安全
 * 场景：
 *
 * 方法锁：
 * 优点：节省了内存，线程安全
 * 缺点：性能低
 *
 * @author : lipu
 * @since : 2020-04-05 23:26
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}

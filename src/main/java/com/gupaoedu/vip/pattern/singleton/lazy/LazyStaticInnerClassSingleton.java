package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * 静态内部类
 *
 * @author : lipu
 * @since : 2020-04-06 10:40
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        if (lazyHolder.instance != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return lazyHolder.instance;
    }

    private static class lazyHolder {
        private static final LazyStaticInnerClassSingleton instance = new LazyStaticInnerClassSingleton();
    }
}

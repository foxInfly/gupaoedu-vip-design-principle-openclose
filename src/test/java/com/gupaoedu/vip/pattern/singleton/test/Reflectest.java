package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author : lipu
 * @since : 2020-04-06 10:48
 */
public class Reflectest {

    public static void main(String[] args) {
        Class<?> clazz = LazyStaticInnerClassSingleton.class;
        try {
            Constructor<?> c = clazz.getDeclaredConstructor(null);

            c.setAccessible(true);

            Object instance = c.newInstance();
            Object instance2 = c.newInstance();

            System.out.println(instance);
            System.out.println(instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

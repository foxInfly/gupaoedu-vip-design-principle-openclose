package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @author : lipu
 * @since : 2020-04-06 11:03
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
//        EnumSingleton instance = EnumSingleton.getInstance();
//        instance.setData(new Object());


        try {
            Class<EnumSingleton> clazz = EnumSingleton.class;
            Constructor<EnumSingleton> c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            System.out.println(c);
            EnumSingleton instance1 = c.newInstance();
            EnumSingleton instance2 = c.newInstance();

            System.out.println(instance1);
            System.out.println(instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

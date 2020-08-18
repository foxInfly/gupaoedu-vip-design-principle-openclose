package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.ContainerSingleton;

/**
 * @author : lipu
 * @since : 2020-04-06 11:25
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        Object instance = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
        System.out.println(instance);
    }
}

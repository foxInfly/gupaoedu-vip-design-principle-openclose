package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author : lipu
 * @since : 2020-04-07 23:07
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecuterThread());
        Thread t2 = new Thread(new ExecuterThread());

        t1.start();
        t2.start();

        System.out.println("End");
    }
}

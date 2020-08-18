package com.gupaoedu.vip.pattern.singleton.test;

/**
 * @author : lipu
 * @since : 2020-04-06 09:57
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecuterThread());
        Thread t2 = new Thread(new ExecuterThread());
        Thread t3 = new Thread(new ExecuterThread());
        Thread t4 = new Thread(new ExecuterThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("End");
    }
}

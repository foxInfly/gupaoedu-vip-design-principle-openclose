package com.gupaoedu.vip.design.principle.dependencyinversion;

/**
 * @author : lipu
 * @since : 2020-04-05 19:09
 */
public class test {
    public static void main(String[] args) {
        a a = new a();
        b b = new b();
        System.out.println(a.toString());
        System.out.println(b.toString());
        b=a;
        System.out.println(b.toString());

    }
}

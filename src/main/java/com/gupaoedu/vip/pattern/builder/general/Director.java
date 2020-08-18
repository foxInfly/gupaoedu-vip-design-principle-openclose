package com.gupaoedu.vip.pattern.builder.general;

/**
 * @author : lipu
 * @since : 2020-04-11 23:18
 */
public class Director {

    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();

        System.out.println(builder.build());
    }
}

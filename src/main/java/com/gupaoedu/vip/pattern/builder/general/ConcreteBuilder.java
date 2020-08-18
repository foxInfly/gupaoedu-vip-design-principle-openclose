package com.gupaoedu.vip.pattern.builder.general;

/**
 * @author : lipu
 * @since : 2020-04-11 23:17
 */
public class ConcreteBuilder implements IBuilder{

    private Product product = new Product();

    public Product build(){
        return product;
    }
}

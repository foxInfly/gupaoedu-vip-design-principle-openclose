package com.gupaoedu.vip.pattern.singleton.register;

/**
 * @author : lipu
 * @since : 2020-04-06 11:01
 */
public enum EnumSingleton {

    //放map里存放的，其实就是饿汉式
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}

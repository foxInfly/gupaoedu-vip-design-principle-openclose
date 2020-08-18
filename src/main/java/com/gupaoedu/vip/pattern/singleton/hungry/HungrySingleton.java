package com.gupaoedu.vip.pattern.singleton.hungry;

/**优点：执行效率高，性能高，没有任何的锁
 * 缺点：加载的时候就创建，如果没有用到，会造成内存的浪费
 *场景：小系统，类少，大系统，类多时，不使用
 * @author : lipu
 * @since : 2020-04-05 23:13
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //隐藏构造方法
    private HungrySingleton() {}

    //全局访问点
    public static HungrySingleton getInstance(){return hungrySingleton;}
}

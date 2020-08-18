package com.gupaoedu.vip.pattern.singleton.Seriable;

import java.io.Serializable;

/**
 * @author : lipu
 * @since : 2020-04-07 08:06
 */
public class SeriableSingleton implements Serializable {
    /*
    序列化：把内存中对象的状态转换为字节码的形式，再把字节码通过IO输出流，写到磁盘上；永久保存下来，叫做持久化。
    反序列化：序列化的反操作。将磁盘的字节码转换为IO流，去取其内容转换为Java对象；在转换过程中会重新创建对象new

     */
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){return INSTANCE;}

    //桥接模式,防止单例对象被序列化和反序列化破坏
    private Object readResolve(){return INSTANCE;}
}

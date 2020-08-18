package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.gupaoedu.vip.pattern.singleton.lazy.LazySimpleSingleton;
import com.gupaoedu.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author : lipu
 * @since : 2020-04-05 23:43
 */
public class ExecuterThread implements Runnable{
    public void run() {
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}

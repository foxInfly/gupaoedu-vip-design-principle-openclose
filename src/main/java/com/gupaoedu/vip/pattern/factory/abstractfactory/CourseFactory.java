package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * @author : lipu
 * @since : 2020-04-05 21:49
 */
public abstract class CourseFactory {
    public void init(){
        System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();
    protected abstract IVideo createVideo();
}

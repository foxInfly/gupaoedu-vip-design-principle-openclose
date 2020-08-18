package com.gupaoedu.vip.pattern.factory.factorymethod;

/**
 * @author : lipu
 * @since : 2020-04-05 20:58
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}

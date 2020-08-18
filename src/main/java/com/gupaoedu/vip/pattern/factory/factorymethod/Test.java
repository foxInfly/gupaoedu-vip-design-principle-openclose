package com.gupaoedu.vip.pattern.factory.factorymethod;


/**
 * @author : lipu
 * @since : 2020-04-05 20:19
 */
public class Test {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.record();

    }
}

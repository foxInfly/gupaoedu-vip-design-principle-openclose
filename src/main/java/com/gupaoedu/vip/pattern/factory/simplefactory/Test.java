package com.gupaoedu.vip.pattern.factory.simplefactory;

/**
 * @author : lipu
 * @since : 2020-04-05 20:19
 */
public class Test {

    public static void main(String[] args) {
        ICourse course = new CourseFactory().create(JavaCourse.class);
        course.record();

    }
}

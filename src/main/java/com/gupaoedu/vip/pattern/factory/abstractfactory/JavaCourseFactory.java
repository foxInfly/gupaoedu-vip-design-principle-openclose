package com.gupaoedu.vip.pattern.factory.abstractfactory;


/**
 * @author : lipu
 * @since : 2020-04-05 20:58
 */
public class JavaCourseFactory extends CourseFactory {
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}

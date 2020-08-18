package com.gupaoedu.vip.pattern.factory.abstractfactory;


/**
 * @author : lipu
 * @since : 2020-04-05 20:58
 */
public class PythonCourseFactory extends CourseFactory {
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}

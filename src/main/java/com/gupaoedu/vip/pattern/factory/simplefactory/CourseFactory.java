package com.gupaoedu.vip.pattern.factory.simplefactory;

/**
 * @author : lipu
 * @since : 2020-04-05 20:25
 */
public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz){
        //====v1.0==============
/*        if("java".equals(name)){
            return new JavaCourse();
        }else if ("python".equals(name)){
            return new PythonCourse();
        }else{
            return null;
        }*/

        //====v2.0==============
/*        try {
            if (!(className == null || "".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;*/

        //====v3.0==============

        try {
            if (clazz != null ) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

package com.gupaoedu.vip.design.principle.dependencyinversion;

/**
 * @author : lipu
 * @since : 2020-04-05 17:39
 */
public class DipTest {

    public static void main(String[] args) {

        //====v2======
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());


        //====v3======
//        Tom tom = new Tom(new JavaCourse());
//        tom.study();

        //====v4======
        Tom tom = new Tom();
        tom.setiCourse(new JavaCourse());
        tom.study();
    }
}

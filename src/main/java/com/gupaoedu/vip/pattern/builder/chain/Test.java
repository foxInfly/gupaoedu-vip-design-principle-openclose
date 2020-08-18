package com.gupaoedu.vip.pattern.builder.chain;

/**
 * @author : lipu
 * @since : 2020-04-11 23:27
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式")
                .addPpt("PPT课件")
                .addVideo("[录播视频]");

        System.out.println(builder.builder());
    }
}

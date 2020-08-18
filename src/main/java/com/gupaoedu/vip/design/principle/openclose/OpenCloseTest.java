package com.gupaoedu.vip.design.principle.openclose;

/**
 * @author : lipu
 * @since : 2020-04-05 17:08
 */
public class OpenCloseTest {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1,"Java架构",11800D);
        System.out.println("课程id："+iCourse.getId()+
                "\n课程名称：《"+iCourse.getName()+
                "》\n课程原价："+iCourse.getPrice()+
                "\n课程售价："+((JavaDiscountCourse) iCourse).getDisCountPrice());
    }
}

package com.gupaoedu.vip.design.principle.openclose;

/**打折
 * @author : lipu
 * @since : 2020-04-05 17:13
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDisCountPrice() {
        return super.getPrice()*0.6;
    }
}

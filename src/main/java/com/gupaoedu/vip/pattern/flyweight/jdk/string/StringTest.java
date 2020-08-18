package com.gupaoedu.vip.pattern.flyweight.jdk.string;

/**
 * Created by Tom.
 */
public class StringTest {
    public static void main(String[] args) {
        //"hello"在编译阶段就创建了是常量(在String常量池中)，s1在运行阶段创建，然后把常量赋值给s1
        String s1 = "hello";
        //s2也是从常量池中取出赋值的
        String s2 = "hello";
        //"he"和"llo"，JDK底层：两个常量在编译阶段就优化变成了一个常量
        String s3 = "he" + "llo";
        //new String()在运行阶段执行， "hel"独立空间， new String("lo")独立空间，和"hello"就不是一个了
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        //intern(),去拿到s5对象内部对应的常量池地址，相当于只包了一层，然后又拿到了常量池中的地址
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//true
        System.out.println(s1==s4);//false
        System.out.println(s1==s9);//false
        System.out.println(s1==s5);//false
        System.out.println(s4==s5);//false
        System.out.println(s1==s6);//true
        System.out.println(s1==s9);//false
    }
}

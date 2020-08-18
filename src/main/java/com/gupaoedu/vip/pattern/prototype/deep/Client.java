package com.gupaoedu.vip.pattern.prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom.
 */
public class Client {


    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);


        //拷贝原型对象
//        ConcretePrototype cloneType = prototype.clone();
        ConcretePrototype cloneType = prototype.deepClone();
        cloneType.getHobbies().add("java");
        System.out.println("prototype:"+prototype);

        System.out.println("cloneType:"+cloneType);

        System.out.println(cloneType == prototype);
        System.out.println(cloneType.getHobbies() == prototype.getHobbies());

    }


}

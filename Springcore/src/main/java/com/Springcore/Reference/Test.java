package com.Springcore.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        ApplicationContext context= new ClassPathXmlApplicationContext("ReferenceConfig.xml");
        RefA temp=(RefA) context.getBean("RefA");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);
    }
}

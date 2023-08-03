package com.Springcore.ConstructorInject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorConfig.xml");
        Person p=(Person) context.getBean("person");
        System.out.println(p);
        Addition Add=(Addition) context.getBean("add");
        Add.doSum();
    }
}

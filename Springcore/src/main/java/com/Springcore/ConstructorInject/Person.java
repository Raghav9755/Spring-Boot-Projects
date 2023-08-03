package com.Springcore.ConstructorInject;

import java.util.*;
public class Person {
    private String name;
    private int personId;
    private int age;
    private Certi certi;
    private List<String> list;
    public Person(String name, int personId, int age,Certi certi,List<String> list) {
        this.name = name;
        this.personId = personId;
        this.age = age;
        this.certi=certi;
        this.list=list;
    }
        @Override
        public String toString(){
            return this.name +" : "+ this.personId +" : "+ this.age +" : "+this.certi.getName()+" :+: "+this.list;
        }

}

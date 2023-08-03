package com.Springcore.ConstructorInject;

public class Addition {
    private int a;
    private int b;
    //constructor
    public Addition(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor : int , int ");
    }
    //constructor
    public Addition(double a,double b){
        this.a=(int)a;
        this.b=(int)b;
        System.out.println("constructor : Double ,Double");
    }
    public Addition(String a,String b){
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("Constructor : String ,String");
    }
    //method
    public void doSum(){
        System.out.println("Value of a "+this.a);
        System.out.println("value of b "+this.b);
        System.out.println("Sum is "+(this.a+this.b));
    }
}

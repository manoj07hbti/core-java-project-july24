package oops.abstraction;

public abstract class DemoAbstraction {

    //TODO Abstract method : a method without method body
    //access_specifier abstract return_type method_name(input param);
    public abstract void m1();// Abstract method

    //TODO Abstract class: any class which has at least one abstract method is called as Abstract class
    public void m2(){
        System.out.println("This is M2 method ");
    }
    //50 % abstraction achieved here hence
    // TODO Abstract classes provides partial abstraction as we also have normal methods in a abstract class
    //TODO Q: can we  create object of Abstract class? if No then why ?
    public static void main(String[] args) {
        /* DemoAbstraction obj= new DemoAbstraction();// No we can not create object of Abstract class
        obj.m1(); */
        /*TODO Ans: As abstract method do not have any code to execute so JVM will not be able to execute anything so java do not
           Support creation of object for a Abstract class */
    }

}

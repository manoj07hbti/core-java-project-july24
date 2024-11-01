package oops.polymorphism;

public class MethodOverriding {

    public void m1(){
        System.out.println("This is m1 of Parent class");
    }

    protected void m2(){
        System.out.println("This is m2 of Parent class");
    }

    public MethodOverriding demo(){

        return new MethodOverriding();
    }

    public static void main(String[] args) {

        MethodOverriding obj= new MethodOverriding();
        obj.m1();
    }
}

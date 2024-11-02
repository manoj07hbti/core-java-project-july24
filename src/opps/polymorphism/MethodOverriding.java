package opps.polymorphism;

public class MethodOverriding {


    public void m1(){

        System.out.println("THIS IS m1 of parent class");

    }


    public MethodOverriding demo(){

        return new MethodOverriding();
    }

    public static void main(String[] args) {
    MethodOverriding obj=new MethodOverriding();

    obj.m1();
    }
}

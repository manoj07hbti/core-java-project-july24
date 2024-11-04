package oops.polymorphism;

public class Child extends MethodOverriding{

    @Override
    public void m1(){
        System.out.println("This is child class method");
    }

    @Override
    public void m2(){
        System.out.println("This is m2 of Parent class");
    }
    //co variant return type
    @Override
    public Child demo(){

        return new Child();
    }
    public static void main(String[] args) {

        MethodOverriding obj= new MethodOverriding();
        obj.m1(); // parent class method

        MethodOverriding obj2= new Child();// call child class method
        obj2.m1();
        //TODO : In Runtime polymorphism JVM checks the current object, and identify class and based on object it will call same class method
        // Child obj3= new MethodOverriding();
       //  obj3.m1();  compile time error because child can not store parent

    }
}

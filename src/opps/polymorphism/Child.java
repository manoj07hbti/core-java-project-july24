package opps.polymorphism;

public class Child extends MethodOverriding{


  @Override
    public void m1(){

      System.out.println("this is child class method");
    }

    // CO VARIANT return type  only perents class m
    @Override
    public Child demo(){

    return new Child();
    }

    public static void main(String[] args) {

      MethodOverriding obj=new MethodOverriding();

      obj.m1();

      MethodOverriding obj2=new Child();
      obj2.m1();
    }
}




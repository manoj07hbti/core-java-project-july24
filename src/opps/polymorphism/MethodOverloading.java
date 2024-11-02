package opps.polymorphism;

public class MethodOverloading {


    public void m1(){
        System.out.println("THIS IS M1 METHOD....");
    }

    public void m1(int age){
        System.out.println("this is method overloaded with one int parameter... "+age);
    }

    public void m1(String name){
        System.out.println("THIS IS M1 method overloaded with one String parameter..."+name);
    }

    public void m1(String name,int age){
        System.out.println("THIS IS M1 METHOD OVERLOADED WITH TWO PARAMETER..."+name+"age:"+age);
    }

    public static void main(String[] args) {

        MethodOverloading obj=new MethodOverloading();

        obj.m1();//
        obj.m1(33);
        obj.m1("rashmi");
        obj.m1("ruhi",22);
    }
}

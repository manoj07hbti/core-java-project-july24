package oops.polymorphism;

public class MethodOverloading {

    public void m1(){
        System.out.println("This is m1 method ...");
    }

    public void m1(int age){
        System.out.println("This is m1 method overloaded with one int param..."+age);
    }
    public void m1(String name){
        System.out.println("This is m1 method overloaded with one String param..."+name);
    }

    public void m1(String name, int age){
        System.out.println("This is m1 method overloaded with two params..."+name+ " ,Age: "+age);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.m1();//
        obj.m1(21);//
        obj.m1("Rahul");
        obj.m1("Raj", 23);
    }
    public static void main(int args) {

    }
    public static void main() {

    }

    // TODO: CAN we have multiple main method in single java class : YES, by using method overloading
    //TODO: but JVM will only understand main method which has String array input and rest will be treated as normal method
}

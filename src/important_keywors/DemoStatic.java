package important_keywors;

public class DemoStatic {

    int age=21;// non static data

    public static void m1(){
        System.out.println("This is M1 static method...");
       // System.out.println(age);
    }
    public static void m1(int a){
        System.out.println("This is M1 static method...");
    }
    public static void m1(int a, int b){
        System.out.println("This is M1 static method...");
    }

    public static void main(String[] args) {
        // ClassName.methodName();

        DemoStatic.m1();
        //TODO Q.1: Can we override static method ?
        // ANS: Yes, we can override but we can not achieve overiding (runtime polymorphism will not happen
        // because we are not creating any object.)
        // Q.2: Can we overload static method ?
        //  ANS-Yes , overloading is fully supported
        // Q.3: Can we use non static data inside a static method ?
        //     a data which is not static is called non static
        //  ANS-NO , we can not use as non static data: as it will get initialized only when object is created but for static method we do not create object to call it.



    }
}

package oops.abstraction;

public class ImplDemoAbstract extends DemoAbstraction implements DemoInterface{


    @Override
    public void m1() {
        System.out.println("This is m1 method of child class");
    }

    @Override
    public void m3() {

    }

    public static void main(String[] args) {

        ImplDemoAbstract obj= new ImplDemoAbstract();
        obj.m1();
    }

}

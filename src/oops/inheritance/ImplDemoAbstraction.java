package oops.inheritance;

import oops.inheritance.abstraction.DemoAbstraction;
import oops.inheritance.demoInterface.InterfaceExample;

public class ImplDemoAbstraction extends DemoAbstraction implements InterfaceExample {


    @Override
    public void m1() {
        System.out.println("this is implemented method of demo abstraction");
    }

    @Override
    public void m3() {

    }

    public static void main(String[] args) {
        ImplDemoAbstraction obj = new ImplDemoAbstraction();
        obj.m1();
        obj.m2();
    }
}

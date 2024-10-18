package oops.inheritance;

// SINGLE LEVEL INHERITANCE
public class DemoB extends DemoA{
    protected void m3(){
        System.out.println("This is M3 method DemoB CLASS");
    }

    public static void main(String[] args) {
        DemoB demoB= new DemoB();
        demoB.m1();// we are calling parent class method
        demoB.m2();

    }
}

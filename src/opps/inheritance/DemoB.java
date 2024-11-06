package opps.inheritance;

public class DemoB extends DemoA {

    // this is single level inheritance

    public static void main(String[] args) {
        DemoA demoA = new DemoA();
        demoA.h1();
        demoA.h2();
        demoA.h3();
        demoA.h4();
    }

    protected void h5(){
        System.out.println("this is relation of demo A");
    }

}

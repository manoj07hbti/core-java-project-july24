package important_keywors;


public class ChildStatic extends DemoStatic {

    public static void m1(){
        System.out.println("CHILD This is M1 static method...");
    }

    public static void main(String[] args) {
        ChildStatic.m1();
    }
}

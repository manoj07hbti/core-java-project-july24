package methods;

public class DemoEmployee {

    public void work(){
        System.out.println("THis is work method");
    }

    public void eat(){
        System.out.println("THis is eat method");
    }

    public void sleep(){
        System.out.println("THis is sleep method");
    }

    public static void main(String[] args) {

        DemoEmployee obj = new DemoEmployee();

        obj.work();
        obj.eat();
        obj.sleep();

    }

}

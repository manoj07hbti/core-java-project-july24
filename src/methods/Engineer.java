package methods;

public class Engineer {

    public void design(){
        System.out.println("THis is design method");
    }

    public void eat(){
        System.out.println("THis is eat method");
    }

    public void sleep(){
        System.out.println("THis is sleep method");
    }

    public static void main(String[] args) {

        Engineer obj = new Engineer();

        obj.design();
        obj.eat();
        obj.sleep();

    }
}

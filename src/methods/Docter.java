package methods;

public class Docter {

    public void surgery(){
        System.out.println("DOCTOR:SURGERY");
    }

    public void eat(){
        System.out.println("DOCTOR:EAT");
    }

    public void sleep(){
        System.out.println("DOCTOR:SLEEP");
    }

    public static void main(String[] args) {

        Docter d1 = new Docter();
        d1.surgery();
        d1.eat();
        d1.sleep();
    }

}

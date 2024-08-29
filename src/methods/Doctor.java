package methods;

import javax.print.Doc;

public class Doctor {

    public void surgery(){
        System.out.println("THis is surgery method");
    }

    public void eat(){
        System.out.println("THis is eat method");
    }

    public void sleep(){
        System.out.println("THis is sleep method");
    }

    public static void main(String[] args) {

        Doctor obj = new Doctor();

        obj.surgery();
        obj.eat();
        obj.sleep();

    }
}

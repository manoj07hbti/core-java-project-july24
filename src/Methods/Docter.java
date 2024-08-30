package Methods;

public class Docter {

    //methods surgery, eat and sleep

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void surgery() {

        System.out.println("this is work method of docter");

    }

    public void eat() {

        System.out.println("printing docter eat time");
    }

    public void sleep() {

        System.out.println("printing docter sleeping tine");

    }

    public static void main(String[] args) {


        // case 1: create Object using default constructor

        Docter surgery1 = new Docter();

        //  case 2: objName.MethodName();

        surgery1.surgery();
        surgery1.eat();
        surgery1.sleep();


    }


}

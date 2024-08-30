package Methods;

public class Engineer {

    //methods design, eat and sleep

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void design() {

        System.out.println("this is design method of engg");

    }

    public void eat() {

        System.out.println("printing engg eat time");
    }

    public void sleep() {

        System.out.println("printing engg sleeping tine");
    }

    public static void main(String[] args) {


        // case 1: create Object using default constructor

        Engineer design1 = new Engineer();

        //  case 2: objName.MethodName();

        design1.design();
        design1.eat();
        design1.sleep();


    }


}

package Methods;

public class Employee {
    public Employee() {
    }

    //data members

    //methods work, eat and sleep

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void work() {

        System.out.println("this is work method of employee");

    }

    public void eat() {

        System.out.println("printing employee eat time");
    }

    public void sleep() {

        System.out.println("printing eployee sleeping tine");

    }

    public static void main(String[] args) {

        // case 1: create Object using default constructor

        Employee work1 = new Employee();

        //  case 2: objName.MethodName();

        work1.work();
        work1.eat();
        work1.sleep();

    }


}

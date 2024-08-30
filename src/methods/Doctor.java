package methods;

public class Doctor {


    //2methods SURGERY, EAT, SLEEP
    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}


    public void surgery() {
        System.out.println("THIS IS SURGERY METHOD");
    }


    public void eat() {
        System.out.println("THIS IS EAT METHOD");
    }

    private void sleep() {
        System.out.println("THIS IS SLEEP METHOD");
    }

    public static void main(String[] args) {
        //STEP 1: create Object using default constructor

        Doctor doctor1 = new Doctor();

        //STEP 2:objName.MethodName();

        doctor1.surgery();
        doctor1.eat();
        doctor1.sleep();

    }


}

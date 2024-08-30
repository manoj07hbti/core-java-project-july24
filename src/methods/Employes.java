package methods;

public class Employes {

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void work() {
        System.out.println("THIS IS METHOD OF WORK");

    }


    public void eat() {
        System.out.println("THIS IS METHOD OF EAT");

    }


    private void sleep() {
        System.out.println("THIS IS METHOD OF SLEEP");
    }

    public static void main(String[] args) {

        //STEP 1: create Object using default constructor
        Employes employes1 = new Employes();


        //STEP 2:objName.MethodName();
        employes1.work();
        employes1.eat();
        employes1.sleep();

    }


}


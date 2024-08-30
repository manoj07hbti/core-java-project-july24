package methods;

public class Engineer {

    //SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}
    public void design() {
        System.out.println("THIS IS METHOD OF DESIGN");
    }


    private void eat() {
        System.out.println("THIS IS METHOD OF EAT");
    }

    private void sleep() {
        System.out.println("THIS IS METHOD OF SLEEP");
    }

    public static void main(String[] args) {

        Engineer engineer1 = new Engineer();

        engineer1.design();
        engineer1.eat();
        engineer1.sleep();


    }


}

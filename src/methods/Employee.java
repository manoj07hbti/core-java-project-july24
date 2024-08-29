package methods;

public class Employee {

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

        Employee obj = new Employee();

        obj.work();
        obj.eat();
        obj.sleep();

    }

}

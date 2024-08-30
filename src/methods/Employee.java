package methods;

public class Employee {


    public void work(){
        System.out.println("EMPLOYEE:WORK");
    }

    public void eat(){
        System.out.println("EMPLOYEE:EAT");
    }

    public void sleep(){
        System.out.println("EMPLOYEE:SLEEP");
    }

    public static void main(String[] args) {
        Employee e1 =new Employee();
        e1.work();
        e1.eat();
        e1.sleep();
    }
}

package methods;

public class Employee {

    String name;
    int age;
    String city;
    String department;

    // Methods  work, eat, sleep

    //  Syntax: access specifier return type method name(parameter) {code}

    public void work() {
        System.out.println("This is work method for employee");
    }

    public void eat() {
        System.out.println("This is eat method.. for employee class");
    }

    public void sleep() {
        System.out.println("This is sleep method.. for employee");
    }

    public static void main(String[] args) {
        // 1 create object using default constructor


        Employee emp = new Employee();



        // 2  objname.methodname();
        emp.eat();
        emp.work();
        emp.sleep();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment(){
      return department;
    }
    public void setDepartment(){

    }
}














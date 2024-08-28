package classandobject;

public class Employee {


    String name = "Rahul";
    int age = 30;
    String city = "Delhi";
    String department = "IT";

    // default

    // Syntax ;  Classname object= new classname
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("Printing object....." + emp1.city);
        System.out.println("printing object..." + emp1.name);
        System.out.println("Printing object....." + emp1.age);
        System.out.println("Printing object....." + emp1.department);

        // now we have have created object2

        Employee emp = new Employee();
        System.out.println("Name: " + emp.name + " Department " + emp.department + " Age " + emp.age + " City " + emp.city);

        // now we created 3object

        Employee emp2 = new Employee();
        System.out.println("Name: " + emp2.name + " Department " + emp2.department + " Age " + emp2.age + " City " + emp2.city);

        // now we created 4 object
        Employee emp3 = new Employee();
        System.out.println("Name: " + emp3.name + " Department " + emp3.department + " Age " + emp3.age + " City " + emp3.city);


    }


}









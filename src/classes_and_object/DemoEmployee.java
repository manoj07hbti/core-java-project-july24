package classes_and_object;

public class Employee {
    String name = "Anshul";
    int empid = 4510;
    String department = "IT";

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();

        System.out.println("Name- "+emp1.name +" EmployeeId- "+emp1.empid +" Department- "+emp1.department );
        System.out.println("Name- "+emp2.name +" EmployeeId- "+emp2.empid +" Department- "+emp2.department );
        System.out.println("Name- "+emp3.name +" EmployeeId- "+emp3.empid +" Department- "+emp3.department );
        System.out.println("Name- "+emp4.name +" EmployeeId- "+emp4.empid +" Department- "+emp4.department );
        System.out.println("Name- "+emp5.name +" EmployeeId- "+emp5.empid +" Department- "+emp5.department );

    }


}

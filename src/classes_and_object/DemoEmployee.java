package classes_and_object;

public class DemoEmployee {
    String name = "Anshul";
    int empid = 4510;
    String department = "IT";

    public static void main(String[] args) {

        DemoEmployee emp1 = new DemoEmployee();
        DemoEmployee emp2 = new DemoEmployee();
        DemoEmployee emp3 = new DemoEmployee();
        DemoEmployee emp4 = new DemoEmployee();
        DemoEmployee emp5 = new DemoEmployee();

        System.out.println("Name- "+emp1.name +" EmployeeId- "+emp1.empid +" Department- "+emp1.department );
        System.out.println("Name- "+emp2.name +" EmployeeId- "+emp2.empid +" Department- "+emp2.department );
        System.out.println("Name- "+emp3.name +" EmployeeId- "+emp3.empid +" Department- "+emp3.department );
        System.out.println("Name- "+emp4.name +" EmployeeId- "+emp4.empid +" Department- "+emp4.department );
        System.out.println("Name- "+emp5.name +" EmployeeId- "+emp5.empid +" Department- "+emp5.department );

    }


}

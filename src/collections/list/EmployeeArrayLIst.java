package collections.list;
import model.Employee2;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayLIst {

    public ArrayList<Employee2> createEmployeeList(){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Employee2> employee2ArrayList = new ArrayList<>();

        System.out.print("Enter the number of employees to add: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();



        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            System.out.print("Department: ");
            String department = scanner.nextLine();

            Employee2 employee2 = new Employee2(name, age, department);
            employee2ArrayList.add(employee2);
        }

        return employee2ArrayList;

    }

    public static void main(String[] args) {

        EmployeeArrayLIst  obj = new EmployeeArrayLIst();

        for(Employee2 var : obj.createEmployeeList()){
            System.out.println("Name: "+var.getName() + " EmployeeID: "+var.getEmployeeId() + " Department: " +var.getEmployeeId());
        }

    }

}

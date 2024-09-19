package collections.list;
import model.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayLIst {

    public ArrayList<Employee> createEmployeeList(){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

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

            Employee employee = new Employee(name, age, department);
            employeeArrayList.add(employee);
        }

        return employeeArrayList;

    }

    public static void main(String[] args) {

        EmployeeArrayLIst  obj = new EmployeeArrayLIst();

        for(Employee var : obj.createEmployeeList()){
            System.out.println("Name: "+var.getName() + " EmployeeID: "+var.getEmployeeId() + " Department: " +var.getEmployeeId());
        }

    }

}

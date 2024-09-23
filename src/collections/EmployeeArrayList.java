package collections;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        System.out.println("Please enter number of employees...");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < numberOfEmployees; i++) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("Enter detail of employess..." + i);

            System.out.print("Name...");
            String name = scanner1.nextLine();

            System.out.print("Age...");
            int age = scanner.nextInt();
            Scanner scanner2 = new Scanner(System.in);

            System.out.print("department..");
            String department = scanner2.nextLine();

            Employee employee = new Employee(name, age, department);
            employeeArrayList.add(employee);
        }
        return employeeArrayList;
    }


    public static void main(String[] args) {
        EmployeeArrayList obj = new EmployeeArrayList();

        for (Employee var : obj.createEmployeeList()) {
            System.out.println("Printing Name... " + var.getName() + " Age.." + var.getAge() + " Department  " + var.getDepartment());

        }
    }

}

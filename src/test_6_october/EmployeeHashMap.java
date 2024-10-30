package test_6_october;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeHashMap {

    public HashMap<String, ArrayList<Employee>> createEmpHashMap() {

        HashMap<String, ArrayList<model.Employee>> empHashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employee you want to add in IBM");
        int num = scanner.nextInt();
        scanner.nextLine();

        ArrayList<model.Employee> ibmEmployees = new ArrayList<>();


        System.out.println("Enter Employee Name");

        String name = scanner.nextLine();

        System.out.println("Enter Employee salary");

        double salary = scanner.nextDouble();


        System.out.println("Enter Employee City");

        String city = scanner.nextLine();

        System.out.println("Enter Employee Department");


        String dept = scanner.nextLine();


        return empHashMap;

    }

    public static void main(String[] args) {
        Employee obj = new Employee(System.in);


    }
}
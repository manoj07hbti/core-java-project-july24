package collections.map;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeMap {

    public HashMap<String, ArrayList<Employee>> createEmployeeMap() {
        HashMap<String, ArrayList<Employee>> empMap = new HashMap<>();

        ArrayList<Employee> cognizantEmployees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of employees...");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter name of employee");
            String name = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Age");
            int age = scanner2.nextInt();

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Department");
            String department = scanner3.nextLine();

            Employee employee = new Employee(name, age, department);
            cognizantEmployees.add(employee);

            empMap.put("Cognizant", cognizantEmployees);

            for (String key : empMap.keySet()) {
                ArrayList<Employee> employees = empMap.get(key);

                for (Employee employee1 : employees) {
                    System.out.println(" Company name " + key + " Name " + employee1.getName() + " Age " + employee1.getAge() + " Department " + employee1.getDepartment());
                }
            }

        }
        return createEmployeeMap();

    }

    public static void main(String[] args) {
        EmployeeMap obj = new EmployeeMap();
        obj.createEmployeeMap();
    }
}




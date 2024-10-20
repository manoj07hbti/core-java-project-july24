package Collection.List.List;

import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeList() {

        //collectionName <DataType> objName = new CollectionName<>();

        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        System.out.println("How many Employee you want to add to data?");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("EMPLYOEE name");

            String names = scanner1.nextLine();

            System.out.println("AGE");

            int age = scanner1.nextInt();

            System.out.println("SAlARY");

            double salary = scanner1.nextDouble();

            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Department");

            String department = scanner2.nextLine();

           Employee employee = new Employee(names,age,department,salary);

            employeeArrayList.add(employee);
        }
        return employeeArrayList;
    }


    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();

        for (Employee employee : obj.createEmployeeList()) {

            System.out.println("NAME:" + employee.getName() + "AGE:" + employee.getAge() + "SALARY :" +employee.getSalary() + "DEPARTMENT:" + employee.getDepartment());


        }

    }


}

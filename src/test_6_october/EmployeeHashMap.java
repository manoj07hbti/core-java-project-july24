package test_6_october;

import model.Employeeee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeHashMap {

    // Write a program to create Employee(name, Salary, City, Dept) HashMap
    public HashMap<String, ArrayList<Employeeee>>createHashMap() {
        HashMap<String, ArrayList<Employeeee>> emlyHashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee IBM");
        int number = scanner.nextInt();
        ArrayList<Employeeee> ibmEmployees = new ArrayList<>();
        Scanner scanner1= new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the details of Employee" + (i + 1));
            System.out.println("Enter the Name of Employees");
            String name = scanner.nextLine();
            System.out.println("Enter Employees Age");
            int age = scanner.nextInt();
            System.out.println("Enter Employees Salary");
            int salary = scanner.nextInt();
            System.out.println("Enter Dept of Employees");
            String dept = scanner.nextLine();
            Employeeee myibm = new Employeeee(name, age, (int) salary, dept);
            ibmEmployees.add(myibm);
        }
        emlyHashMap.put("IBM", ibmEmployees);

        // 2nd Company TCS

        System.out.println("Enter Employees TCS");
        number = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Employeeee> tcsEmployees = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the details of Employee" + (i + 1));
            System.out.println("Enter Name of Employees");
            String name = scanner.nextLine();
            System.out.println("Enter Age Of Employees");
            int age = scanner.nextInt();
            System.out.println("Enter Salary Of Employees");
            int salary = scanner.nextInt();
            System.out.println("Enter Dept of Employees");
            String Dept = scanner.nextLine();
            Employeeee mytcs = new Employeeee(name, age, salary, Dept);
            tcsEmployees.add(mytcs);
        }
        emlyHashMap.put("TCS", tcsEmployees);


        // 3rd Company Wipro

        System.out.println("Enter Employees Wipro");
        number = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Employeeee> wiproEmployees = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the details of Employee" + (i + 1));
            System.out.println("Enter Name of Employees");
            String name = scanner.nextLine();
            System.out.println("Enter Age Of Employees");
            int age = scanner.nextInt();
            System.out.println("Enter Salary Of Employees");
            int salary = scanner.nextInt();
            System.out.println("Enter Dept of Employees");
            String Dept = scanner.nextLine();
            Employeeee mywipro = new Employeeee(name, age, salary, Dept);
            wiproEmployees.add(mywipro);
        }
        emlyHashMap.put("WIPRO", wiproEmployees);


        //  4 Company CTC
        System.out.println("Enter Employees Ctc");
        number = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Employeeee> tctEmployees = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the details of Employee" + (i + 1));
            System.out.println("Enter Name of Employees");
            String name = scanner.nextLine();
            System.out.println("Enter Age Of Employees");
            int age = scanner.nextInt();
            System.out.println("Enter Salary Of Employees");
            int salary = scanner.nextInt();
            System.out.println("Enter Dept of Employees");
            String Dept = scanner.nextLine();
            Employeeee myctc = new Employeeee(name, age, salary, Dept);
            tctEmployees.add(myctc);

        }
        emlyHashMap.put("CTC", tctEmployees);

        return emlyHashMap;

    }

    public static void main(String[] args) {
        EmployeeHashMap obj= new EmployeeHashMap();
        obj.createHashMap();
    }
}
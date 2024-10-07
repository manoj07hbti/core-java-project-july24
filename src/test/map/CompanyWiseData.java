package test.map;
import model.Employee1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CompanyWiseData {
    public ArrayList<Employee1> ibmEmployee() {
        ArrayList<Employee1> ibmEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of IBM employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter salary of employee: ");
            int salary = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter city of employee: ");
            String city = scanner3.nextLine();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please enter department of employee; ");
            String dept = scanner4.nextLine();
            Employee1 employee = new Employee1(name, salary, city, dept);
            ibmEmp.add(employee);

        }
        return ibmEmp;
    }

    public ArrayList<Employee1> tcsEmployee() {
        ArrayList<Employee1> tcsEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of TCS employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter salary of employee: ");
            int salary = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter city of employee: ");
            String city = scanner3.nextLine();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please enter department of employee; ");
            String dept = scanner4.nextLine();
            Employee1 employee = new Employee1(name, salary, city, dept);
            tcsEmp.add(employee);

        }
        return tcsEmp;
    }

    public ArrayList<Employee1> wiproEmployee() {
        ArrayList<Employee1> wiproEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of WIPRO employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter salary of employee: ");
            int salary = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter city of employee: ");
            String city = scanner3.nextLine();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please enter department of employee; ");
            String dept = scanner4.nextLine();
            Employee1 employee = new Employee1(name, salary, city, dept);
            wiproEmp.add(employee);
        }
        return wiproEmp;
    }

    public ArrayList<Employee1> ctsEmployee() {
        ArrayList<Employee1> ctsEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of CTS employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter salary of employee: ");
            int salary = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter city of employee: ");
            String city = scanner3.nextLine();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please enter department of employee; ");
            String dept = scanner4.nextLine();
            Employee1 employee = new Employee1(name, salary, city, dept);
            ctsEmp.add(employee);
        }
        return ctsEmp;
    }

    public static void main(String[] args) {
        CompanyWiseData obj = new CompanyWiseData();
        LinkedHashMap<String, ArrayList> empMap = new LinkedHashMap<>();
        empMap.put("IBM", obj.ibmEmployee());
        empMap.put("TCS", obj.tcsEmployee());
        empMap.put("WIPRO", obj.wiproEmployee());
        empMap.put("CTS", obj.ctsEmployee());
        for (String key : empMap.keySet()) {

            ArrayList<Employee1> employees = empMap.get(key);
            for (Employee1 employee : employees) {
                System.out.println("Company Name: " + key + " Name:" + employee.getName() + " Salary " + employee.getSalary() + " City: " + employee.getCity() + " Department:" + employee.getDept());

            }
        }
    }
}

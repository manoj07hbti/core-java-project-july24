package test.map;

import model.Employee1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDataGreaterSalary_Pune {
    public ArrayList<Employee1> ibmEmployeeList() {
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

    public ArrayList<Employee1> tcsEmployeeList() {
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

    public ArrayList<Employee1> wiproEmployeeList() {
        ArrayList<Employee1> wiproEmp = new ArrayList<>();
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
            wiproEmp.add(employee);
        }
        return wiproEmp;
    }

    public ArrayList<Employee1> ctsEmployeeList() {
        ArrayList<Employee1> ctsEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of DXC employee's data to enter: ");
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
        EmployeeDataGreaterSalary_Pune obj = new EmployeeDataGreaterSalary_Pune();
        HashMap<String, ArrayList> empMap = new HashMap<>();
        empMap.put("IBM", obj.ibmEmployeeList());
        empMap.put("TCS", obj.tcsEmployeeList());
        empMap.put("WIPRO", obj.wiproEmployeeList());
        empMap.put("CTS", obj.ctsEmployeeList());
        for (String key : empMap.keySet()) {

            ArrayList<Employee1> employees = empMap.get(key);
            for (Employee1 employee : employees) {
                if (key.equals("IBM") || key.equals("TCS")) {
                    if (employee.getSalary() > 50000 && employee.getCity().equals("Pune"))
                        System.out.println("Company Name: " + key + " Name:" + employee.getName() + " Salary " + employee.getSalary() + " City: " + employee.getCity() + " Department:" + employee.getDept());

                }

            }
        }
    }
}


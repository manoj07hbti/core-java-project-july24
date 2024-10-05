package collection.map;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeMap {
    public ArrayList<Employee> ibmEmployeeList() {
        ArrayList<Employee> ibmEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of IBM employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter age of employee: ");
            int age = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter department of employee: ");
            String department = scanner3.nextLine();
            Employee employee = new Employee(name, age, department);
            ibmEmp.add(employee);

        }
        return ibmEmp;

    }

    public ArrayList<Employee> tcsEmployeeList() {
        ArrayList<Employee> tcsEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of TCS employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter age of employee: ");
            int age = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter department of employee: ");
            String department = scanner3.nextLine();
            Employee employee = new Employee(name, age, department);
            tcsEmp.add(employee);

        }
        return tcsEmp;
    }

    public ArrayList<Employee> ctsEmployeeList() {
        ArrayList<Employee> ctsEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of CTS employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter age of employee: ");
            int age = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter department of employee: ");
            String department = scanner3.nextLine();
            Employee employee = new Employee(name, age, department);
            ctsEmp.add(employee);
        }
        return ctsEmp;
    }

    public ArrayList<Employee> dxcEmployeeList() {
        ArrayList<Employee> dxcEmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of DXC employee's data to enter: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter name of employee");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter age of employee: ");
            int age = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter department of employee: ");
            String department = scanner3.nextLine();
            Employee employee = new Employee(name, age, department);
            dxcEmp.add(employee);
        }
        return dxcEmp;
    }

    public static void main(String[] args) {
        EmployeeMap obj = new EmployeeMap();
        HashMap<String, ArrayList> empMap = new HashMap<>();
        empMap.put("IBM", obj.ibmEmployeeList());
        empMap.put("TCS",obj.tcsEmployeeList());
        empMap.put("CTS",obj.ctsEmployeeList());
        empMap.put("DXC",obj.dxcEmployeeList());
        for(String key : empMap.keySet()){

            ArrayList<Employee> employees=empMap.get(key);
            for(Employee employee: employees){
                System.out.println("Company Name: "+key + " Name:"+employee.getName()+" Age "+employee.getAge()+ " Department:"+employee.getDepartment());

            }

        }
    }

}





package test_6_october;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

    public ArrayList<Employee> createEmployeeData() {

        System.out.println("How many employee you want to enter");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println(" Enter name ");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter salary");
            double salary = scanner2.nextDouble();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter city");
            String city = scanner3.nextLine();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Enter department");
            String department = scanner4.nextLine();

            Employee employee = new Employee(name, city, salary, department);
            employeeArrayList.add(employee);

        }
        return employeeArrayList;
    }

    public void FindHighestLowest(ArrayList<Employee> employeeArrayList) {
        Double highestSalary = 0.0;
        Double lowestSalary = 0.0;

        for (Employee emp : employeeArrayList) {

            if (highestSalary < emp.getSalary()) {
                highestSalary = emp.getSalary();
            }

            if (lowestSalary < emp.getSalary()) {
                lowestSalary = emp.getSalary();
            }

        }

        System.out.println("We have found employee with highest salary : " + highestSalary);
        System.out.println("We have found employee with lowest salary : " + lowestSalary);
    }


    public void sameCityEmployee(HashMap<String, ArrayList<Employee>> companyWiseData) {
        System.out.println("Which company data you want to compare ");
        Scanner scanner = new Scanner(System.in);
        String company1 = scanner.nextLine();
        System.out.println("Which company data you want to enter");
        String company2 = scanner.nextLine();

        ArrayList<Employee> company1Employee = companyWiseData.get(company1);
        ArrayList<Employee> company2Employee = companyWiseData.get(company2);

        for (Employee company1Emp : company1Employee) {

            for (Employee company2Emp : company2Employee) {

                if (company1Emp.getCity().equals(company2Emp.getCity())) {
                    System.out.println("Comapny 1 Name : " + company1Emp.getName() + " Salary " + company1Emp.getSalary() + " City " + company1Emp.getCity() + " Department " + company1Emp.getDepartment());
                    System.out.println("Company 2 NAme " + company2Emp.getName() + " Salary " + company2Emp.getSalary() + " City " + company2Emp.getCity() + " Department " + company2Emp.getDepartment());
                }
            }
        }
    }

    public void sameSalaryEmployee(HashMap<String, ArrayList<Employee>> companyWiseData) {
        System.out.println("Which two company data you want to compare ");
        Scanner scanner = new Scanner(System.in);
        String company1 = scanner.nextLine();
        System.out.println("Which two comapny data you want to comapre ");
        String company2 = scanner.nextLine();

        ArrayList<Employee> company1Employee = companyWiseData.get(company1);
        ArrayList<Employee> company2Employee = companyWiseData.get(company2);

        for (Employee company1Emp : company1Employee) {

            for (Employee compnay2Emp : company2Employee) {

                if (company1Emp.getSalary().equals(compnay2Emp)) {
                    System.out.println("Company1 Name " + company1Emp.getName() + " Salary " + company1Emp.getSalary() + " City " + company1Emp.getCity() + " Department " + company1Emp.getDepartment());
                    System.out.println(" Compant2 Name " + compnay2Emp.getName() + " Salary " + compnay2Emp.getSalary() + " City " + compnay2Emp.getCity() + " Department " + compnay2Emp.getDepartment());
                }
            }
        }
    }


    public static void main(String[] args) {
        Test obj = new Test();
        String choice = "Y";
        HashMap<String, ArrayList<Employee>> companyWiseData = new HashMap<>();
        while (choice.equals("Y")) {
            System.out.println("Please enter company name you want to enter");

            Scanner scanner = new Scanner(System.in);
            String companyName = scanner.nextLine();
            ArrayList<Employee> employeeArrayList = obj.createEmployeeData();

            companyWiseData.put(companyName, employeeArrayList);

            for (String key : companyWiseData.keySet()) {
                for (Employee emp : companyWiseData.get(key)) {
                    System.out.println(" Company name " + key);
                    System.out.println(" Name " + emp.getName() + " Salary " + emp.getSalary() + " City " + emp.getCity() + " Department " + emp.getDepartment());
                }
            }

            System.out.println("Do you want to add more company? Press Y to continue and any other number to exit");
            Scanner scanner1 = new Scanner(System.in);
            choice = scanner1.nextLine();
        }

        obj.FindHighestLowest(companyWiseData.get("IBM"));

        obj.sameCityEmployee(companyWiseData);

        obj.sameSalaryEmployee(companyWiseData);


    }
}
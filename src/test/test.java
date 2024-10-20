package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test
{


    public  ArrayList<Employee> createEmployeeData()
    {
        System.out.println("How many employee you want to enter:");
        Scanner scanner= new Scanner(System.in);
        int count=scanner.nextInt();

        ArrayList<Employee> employeeArrayList= new ArrayList<>();
        for(int i=0; i<count; i++)
        {

            Scanner scanner1= new Scanner(System.in);

            System.out.println("Please enter Name:");
            String name= scanner1.nextLine();

            System.out.println("Please enter Salary:");
            double salary=scanner1.nextDouble();

            Scanner scanner2= new Scanner(System.in);
            System.out.println("Please enter City:");
            String city= scanner2.nextLine();
            System.out.println("Please enter Dept:");

            String dept= scanner2.nextLine();

            Employee employee= new Employee(name,salary,city,dept);
            employeeArrayList.add(employee);
        }

        return employeeArrayList;
    }


    public static void main(String[] args)
    {

        test obj= new test();
        Scanner scanner= new Scanner(System.in);

        System.out.println("How many companies do you want to add?");
        int companyCount= scanner.nextInt();
        scanner.nextLine();

        HashMap<String, ArrayList<Employee>> companyWiseData= new HashMap<>();

        for (int i= 0; i< companyCount; i++)
        {
            System.out.println("Please enter the company name:");
            String company= scanner.nextLine();

            ArrayList<Employee> employeeArrayList= obj.createEmployeeData();
            companyWiseData.put(company, employeeArrayList);
        }
    }
}

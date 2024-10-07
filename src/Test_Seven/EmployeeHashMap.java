package Test_Seven;

import Model.employeesMainData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeHashMap
{
    public void targetedCompaniesEmployees(HashMap<String, ArrayList<employeesMainData>> empMap)
    {
        //The targeted employees of IBM and TCS with salary above 50,000
        String[] targetCompanies= {"IBM", "TCS"};

        System.out.println("Employees with salary above 50,000 and belongs from Pune by IBM and TCS:");

        for (String company : targetCompanies)
        {
            if (empMap.containsKey(company))
            {
                ArrayList<employeesMainData> employees = empMap.get(company);

                for (employeesMainData employee : employees)
                {
                    if (employee.getSalary() > 50000 && employee.getCity().equalsIgnoreCase("Pune"))
                    {
                        System.out.println("Name: "+employee.getName()+", Salary: "+employee.getSalary()+", City: "+ employee.getCity()+", Department: "+ employee.getDept()+", Company: "+company);
                    }
                }
            }
        }
    }


    public void printEmployeesCompanyWise(HashMap<String, ArrayList<employeesMainData>> empMap)
    {
        System.out.println("Printing employees grouped by company:");

        for (String company : empMap.keySet())
        {
            System.out.println("Employees of "+company+":");
            ArrayList<employeesMainData> employees = empMap.get(company);

            for (employeesMainData employee : employees)
            {
                System.out.println("Name: "+employee.getName()+", Salary: "+employee.getSalary()+", City: " +employee.getCity()+", Department: "+employee.getDept());
            }
        }
    }

    public void findHighestAndLowestSalaryEmployee(HashMap<String, ArrayList<employeesMainData>> empMap)
    {
        employeesMainData highestSalaryEmployee= null;
        employeesMainData lowestSalaryEmployee= null;

        //This For loop will help us to detect all over the employees
        for (ArrayList<employeesMainData> employees : empMap.values())
        {
            for (employeesMainData employee : employees)
            {
                if (highestSalaryEmployee == null || lowestSalaryEmployee == null)
                {
                    highestSalaryEmployee= employee;
                    lowestSalaryEmployee= employee;
                }

                if (employee.getSalary() > highestSalaryEmployee.getSalary())
                {
                    highestSalaryEmployee= employee;
                }

                if (employee.getSalary() < lowestSalaryEmployee.getSalary())
                {
                    lowestSalaryEmployee= employee;
                }
            }
        }

        //This will help us to print the highest salary employee
        if (highestSalaryEmployee != null)
        {
            System.out.println("Highest Salary Employee:");
            System.out.println("Name: "+highestSalaryEmployee.getName()+", Salary: "+highestSalaryEmployee.getSalary()+", City: "+highestSalaryEmployee.getCity()+", Department: "+highestSalaryEmployee.getDept());
        }

        //This will help us to print the lowest salary employee
        if (lowestSalaryEmployee != null)
        {
            System.out.println("Lowest Salary Employee:");
            System.out.println("Name: "+lowestSalaryEmployee.getName()+", Salary: "+lowestSalaryEmployee.getSalary()+", City: "+lowestSalaryEmployee.getCity()+", Department: "+lowestSalaryEmployee.getDept());
        }
    }

    public void employeeDataStructure()
    {
        HashMap<String, ArrayList<employeesMainData>> empMap = new HashMap<>();
        Scanner scanner= new Scanner(System.in);

        //Storing all the four companies by using an Array
        String[] companies= {"IBM", "TCS", "Wipro", "CTS"};

        //Using For loop for taking the data or input from the user
        for (String company : companies)
        {
            System.out.println("You can only add up to 3 employees for "+company);
            ArrayList<employeesMainData> employees= new ArrayList<>();

            for (int i = 0; i < 3; i++)
            {
                //Limiting to 3 employees per company
                System.out.println("Enter details for employee "+(i + 1)+" of "+company+":");

                System.out.print("Name: ");
                String name= scanner.nextLine();

                System.out.print("Salary: ");
                int salary= scanner.nextInt();
                scanner.nextLine();

                System.out.print("City: ");
                String city= scanner.nextLine();

                System.out.print("Department: ");
                String dept= scanner.nextLine();

                employees.add(new employeesMainData(name, salary, city, dept));
            }
            empMap.put(company, employees);
        }

        //Here we are printing every single employee's data from every company
        for (String key : empMap.keySet())
        {
            ArrayList<employeesMainData> employees= empMap.get(key);
            System.out.println("Employees of "+key+":");
            for (employeesMainData employee : employees)
            {
                System.out.println("Name: "+employee.getName()+", Salary: "+employee.getSalary()+", City: "+employee.getCity()+", Department: "+employee.getDept());
            }
        }
        //Calling the targeted companies Method class in the employeeDataStructure
        targetedCompaniesEmployees(empMap);

        //This will help us to print data of employees by company wise
        printEmployeesCompanyWise(empMap);

        //Here we will print the highest and lowest salary employee
        findHighestAndLowestSalaryEmployee(empMap);
    }

    public static void main(String[] args)
    {
        EmployeeHashMap employeeHashMap= new EmployeeHashMap();
        employeeHashMap.employeeDataStructure();
    }
}
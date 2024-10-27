package test_6_october;

import methods.DemoEmployee;
import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeHashMap {

    //create hashmap
    public ArrayList<Employee> createEmpArrayList(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employee you want to add");
        int num = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for(int i=0; i<num; i++){
            System.out.println("Enter the details of Employee "+(i+1));

            System.out.println("Enter Employee Name");
            String name = sc.nextLine();
            System.out.println("Enter Employee salary");
            double salary= sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Employee City");
            String city = sc.nextLine();
            System.out.println("Enter Employee Department");
            String dept = sc.nextLine();

            Employee tempEmp = new Employee(name,salary,city,dept);

            employeeArrayList.add(tempEmp);

        }

        System.out.println("\n\n\n");

        return employeeArrayList;

    }

    //1: display employee who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS.
    public void diplayEmployee(HashMap<String, ArrayList<Employee>> empHashMap){

        System.out.println("-----------employee who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS-------");

        for(String key : empHashMap.keySet()){

            if(key.equals("IBM") || key.equals("TCS")){
                ArrayList<Employee> employees = empHashMap.get(key);

                for(Employee emp : employees){
                    if(emp.getSalary()> 500000 && emp.getCity().equals("PUNE")){
                        System.out.println("Company Name: "+key + "  Name: "+emp.getName()+ " Salary: "+emp.getSalary() +" City: "+emp.getCity() +" Dept: " +emp.getDept()) ;
                    }
                }
            }
        }

        System.out.println("\n\n\n");
    }

    //2: find highest salary employee and lowest salary employee
    public void findEmployee(HashMap<String, ArrayList<Employee>> empHashMap){

        Employee highestSalaryEmployee = null;
        Employee lowestSalaryEmployee = null;
        for(String key : empHashMap.keySet()){

                ArrayList<Employee> employees = empHashMap.get(key);

                for(Employee emp : employees){
                        if(highestSalaryEmployee == null || emp.getSalary() > highestSalaryEmployee.getSalary()){
                            highestSalaryEmployee = emp;
                        }

                        if(lowestSalaryEmployee == null || emp.getSalary() < lowestSalaryEmployee.getSalary()){
                            lowestSalaryEmployee = emp;
                        }
                }
        }

        System.out.println("Employee with the Highest Salary: ");
        System.out.println("Name: " + highestSalaryEmployee.getName() +
                " Salary: " + highestSalaryEmployee.getSalary() +
                " City: " + highestSalaryEmployee.getCity() +
                " Dept: " + highestSalaryEmployee.getDept());

        System.out.println("Employee with the Lowest Salary: ");
        System.out.println("Name: " + lowestSalaryEmployee.getName() +
                " Salary: " + lowestSalaryEmployee.getSalary() +
                " City: " + lowestSalaryEmployee.getCity() +
                " Dept: " + lowestSalaryEmployee.getDept());

        System.out.println("\n\n\n");
    }

    //3:  display all companies employees data company wise
    public void displayData(HashMap<String, ArrayList<Employee>> empHashMap){

        System.out.println("--------all companies employees data company wise-------------");

        for(String key : empHashMap.keySet()){
            System.out.println("Data of "+key +" Company is :");

            ArrayList<Employee> employees =  empHashMap.get(key);
            for(Employee emp : employees){
                System.out.println("Name: "+emp.getName()+ " Salary: "+emp.getSalary() +" City: "+emp.getCity() +" Dept: " +emp.getDept()) ;
            }
        }

        System.out.println("\n\n\n");
    }


    //4: display all employee data together who is having same city .
    public void displaySameCityEmp(HashMap<String, ArrayList<Employee>> empHashMap){

        System.out.println("--------all companies employees data City wise-------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Which two company data you want to compare");
        String company1= sc.nextLine();
        String company2= sc.nextLine();

        ArrayList<Employee> company1Employees = empHashMap.get(company1);
        ArrayList<Employee> company2Employees = empHashMap.get(company2);


        for(Employee company1Emp : company1Employees){

            for(Employee company2Emp : company2Employees){

                if(company1Emp.getCity().equals(company2Emp.getCity())){
                    System.out.println("Name: "+company1Emp.getName()+ " Salary: "+company1Emp.getSalary() +" City: "+company1Emp.getCity() +" Dept: " +company1Emp.getDept()) ;
                    System.out.println("Name: "+company2Emp.getName()+ " Salary: "+company2Emp.getSalary() +" City: "+company2Emp.getCity() +" Dept: " +company2Emp.getDept()) ;
                }

            }

        }

        System.out.println("\n\n\n");
    }


    //5: display same salary Employees
    public void displaySameSalaryyEmp(HashMap<String, ArrayList<Employee>> empHashMap){

        System.out.println("--------all companies employees having same salary-------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Which two company data you want to compare");
        String company1= sc.nextLine();
        String company2= sc.nextLine();

        ArrayList<Employee> company1Employees = empHashMap.get(company1);
        ArrayList<Employee> company2Employees = empHashMap.get(company2);


        for(Employee company1Emp : company1Employees){

            for(Employee company2Emp : company2Employees){

                if(company1Emp.getSalary() == company2Emp.getSalary()){
                    System.out.println("Name: "+company1Emp.getName()+ " Salary: "+company1Emp.getSalary() +" City: "+company1Emp.getCity() +" Dept: " +company1Emp.getDept()) ;
                    System.out.println("Name: "+company2Emp.getName()+ " Salary: "+company2Emp.getSalary() +" City: "+company2Emp.getCity() +" Dept: " +company2Emp.getDept()) ;
                }

            }

        }

        System.out.println("\n\n\n");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeHashMap obj = new EmployeeHashMap();
        HashMap<String,ArrayList<Employee>> empHashMap = new HashMap<>();

        String choice = "Y";

        while(choice.equals("Y")){

            System.out.println("Please Enter the company Name to Enter Employee data");
            String companyName = sc.nextLine();
            ArrayList<Employee> employeeArrayList = obj.createEmpArrayList();

            empHashMap.put(companyName, employeeArrayList);

            for(String key : empHashMap.keySet()){

                for (Employee emp : empHashMap.get(key)){
                    System.out.println("Company Name: "+key + "  Name: "+emp.getName()+ " Salary: "+emp.getSalary() +" City: "+emp.getCity() +" Dept: " +emp.getDept()) ;
                }

            }

            System.out.println("Do you want to add more company data? Press Y to continue or any other key to exit");
            choice = sc.nextLine();
        }

        //1
        obj.diplayEmployee(empHashMap);
        //2
        obj.findEmployee(empHashMap);
        //3
        obj.displayData(empHashMap);
        //4
        obj.displaySameCityEmp(empHashMap);
        //5
        obj.displaySameSalaryyEmp(empHashMap);

    }
}

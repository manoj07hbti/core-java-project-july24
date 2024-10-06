package test_6_october;

import methods.DemoEmployee;
import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeHashMap {

    //create hashmap
    public HashMap<String, ArrayList<Employee>> createEmpHashMap(){

        HashMap<String, ArrayList<Employee>> empHashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employee you want to add in IBM");
        int num = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> ibmEmployees = new ArrayList<>();
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

            ibmEmployees.add(tempEmp);

        }
        empHashMap.put("IBM", ibmEmployees);


        System.out.println("Enter the number of employee you want to add in TCS");
        num = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> tcsEmployees = new ArrayList<>();
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

            tcsEmployees.add(tempEmp);

        }
        empHashMap.put("TCS", tcsEmployees);

        System.out.println("Enter the number of employee you want to add in WIPRO");
        num = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> wiproEmployees = new ArrayList<>();
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

            wiproEmployees.add(tempEmp);

        }
        empHashMap.put("WIPRO", wiproEmployees);

        System.out.println("Enter the number of employee you want to add in CTS");
        num = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> ctsEmployees = new ArrayList<>();
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

            ctsEmployees.add(tempEmp);

        }
        empHashMap.put("CTS", ctsEmployees);

        System.out.println("\n\n\n");

        return empHashMap;

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

        HashMap<String, ArrayList<Employee>>  cityHashMap = new HashMap<>();

        for(String key : empHashMap.keySet()){

            ArrayList<Employee> employees =  empHashMap.get(key);
            for(Employee emp : employees){
                String city = emp.getCity();
                if(cityHashMap.containsKey(city)){
                    cityHashMap.get(city).add(emp);
                } else{
                    ArrayList<Employee> cityEmployees = new ArrayList<>();
                    cityEmployees.add(emp);
                    cityHashMap.put(city,cityEmployees);
                }
            }
        }

        for(String city : cityHashMap.keySet()){
            System.out.println("Data of employees in " + city + " is:");
            ArrayList<Employee> cityEmployees = cityHashMap.get(city);
            for(Employee emp : cityEmployees){
                System.out.println("Name: " + emp.getName() + " Salary: " + emp.getSalary() + " Dept: " + emp.getDept());
            }
        }

        System.out.println("\n\n\n");
    }


    //5: display same salary Employees
    public void displaySameSalaryyEmp(HashMap<String, ArrayList<Employee>> empHashMap){

    }


    public static void main(String[] args) {

        EmployeeHashMap obj = new EmployeeHashMap();

        HashMap<String,ArrayList<Employee>> empHashMap = obj.createEmpHashMap();

        //1
        obj.diplayEmployee(empHashMap);
        //2
        obj.findEmployee(empHashMap);
        //3
        obj.displayData(empHashMap);
        //4
        obj.displaySameCityEmp(empHashMap);






    }
}

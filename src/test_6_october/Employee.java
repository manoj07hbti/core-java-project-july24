package test_6_october;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


    public class Employee {

        //create hashmap

        public HashMap<String, ArrayList<model.Employee>> createEmpHashMap(){

            HashMap<String, ArrayList<model.Employee>> empHashMap = new HashMap<>();

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of employee you want to add in IBM");
            int num = sc.nextInt();
            sc.nextLine();

            ArrayList<model.Employee> ibmEmployees = new ArrayList<>();

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

                model.Employee tempEmp = new model.Employee(name , salary,city,dept);

                ibmEmployees.add(tempEmp);

            }
            empHashMap.put("IBM", ibmEmployees);
            System.out.println("Enter the number of employee you want to add in TCS");

            num = sc.nextInt();

            sc.nextLine();

            ArrayList<model.Employee> tcsEmployees = new ArrayList<>();

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

                model.Employee tempEmp = new model.Employee(name,salary,city,dept);
                tcsEmployees.add(tempEmp);
            }
            empHashMap.put("TCS", tcsEmployees);

            System.out.println("Enter the number of employee you want to add in WIPRO");
            num = sc.nextInt();
            sc.nextLine();

            ArrayList<model.Employee> wiproEmployees = new ArrayList<>();
            for(int i=0; i<num; i++){

                System.out.println("Enter the details of Employee "+(i+1));

                System.out.println("Enter Employee Name" +wiproEmployees);
                String name = sc.nextLine();

                System.out.println("Enter Employee salary" +wiproEmployees);
                double salary= sc.nextDouble();

                sc.nextLine();

                System.out.println("Enter Employee City" +wiproEmployees);
                String city = sc.nextLine();

                System.out.println("Enter Employee Department" +wiproEmployees);
                String dept = sc.nextLine();

                model.Employee tempEmp = new model.Employee(name,salary,city,dept);
                wiproEmployees.add(tempEmp);

            }
            empHashMap.put("WIPRO", wiproEmployees);

            //cts

            System.out.println("Enter the number of employee you want to add in CTS");
            num = sc.nextInt();

            sc.nextLine();

            ArrayList<model.Employee> ctsEmployees = new ArrayList<>();
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

                model.Employee tempEmp = new model.Employee(name,salary,city,dept);
                ctsEmployees.add(tempEmp);

            }
            empHashMap.put("CTS", ctsEmployees);
            System.out.println("\n\n\n");

            return empHashMap;
        }
        //1: display employee who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS.
        public void diplayEmployee(HashMap<String, ArrayList<model.Employee>> empHashMap){

            System.out.println("-----------employee who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS-------");
            for(String key : empHashMap.keySet()){

                if(key.equals("IBM") || key.equals("TCS")){

                    ArrayList<model.Employee> employees = empHashMap.get(key);

                    for(model.Employee emp : employees){

                        if(emp.getSalary()> 500000 && emp.getCity().equals("PUNE")){

                            System.out.println("Company Name: "+key + "  Name: "+emp.getName()+ " Salary: "+emp.getSalary() +" City: "+emp.getCity() +" Dept: " +emp.getDepartment()) ;
                        }
                    }
                }
            }
            System.out.println("/n");
        }
        //2: find highest salary employee and lowest salary employee

        public void findEmployee(HashMap<String, ArrayList<model.Employee>> empHashMap){

            int highestSalaryEmployee = (int) 50.0000;

            double lowestSalaryEmployee = 20.0000;

            for(String key : empHashMap.keySet()){

                ArrayList<model.Employee> employees = empHashMap.get(key);

                for(model.Employee emp : employees){

                    if (highestSalaryEmployee == lowestSalaryEmployee) {

                        highestSalaryEmployee = emp.getSalary();

                    } else if (emp.getSalary() > highestSalaryEmployee) {

                        highestSalaryEmployee = emp.getSalary();
                    }
                    if(lowestSalaryEmployee == highestSalaryEmployee|| emp.getSalary() < lowestSalaryEmployee){
                        lowestSalaryEmployee = emp.getSalary();

                    }
                }
            }
            System.out.println("Employee with the Highest Salary: ");

            System.out.println("Name: " +   highestSalaryEmployee);
             System.out.println("Salary: " + highestSalaryEmployee);
             System.out.println("City: " + highestSalaryEmployee);
              System.out.println("Dept: " + highestSalaryEmployee);

            System.out.println("Employee with the Lowest Salary: ");
            System.out.println("Name: " + lowestSalaryEmployee);
            System.out.println ("Salary: " + lowestSalaryEmployee);
                System.out.println("City: " + lowestSalaryEmployee);
                    System.out.println(" Dept: " + lowestSalaryEmployee);

        }

        //3:  display all companies employees data company wise

        public void displayData(HashMap<String, ArrayList<model.Employee>> empHashMap){

            System.out.println("all companies employees data company wise-------------");
            for(String key : empHashMap.keySet()){


                System.out.println("Data of "+key +" Company is :");

                ArrayList<model.Employee> employees =  empHashMap.get(key);

                for(model.Employee emp : employees){

                    System.out.println("Name: "+emp.getName()+ " Salary: "+emp.getSalary() +" City: "+emp.getCity() +" Dept: " +emp.getDepartment()) ;
                }

            }
            System.out.println("\n");
        }
        //4: display all employee data together who is having same city .

        public void displaySameCityEmp(HashMap<String, ArrayList<model.Employee>> empHashMap){

            System.out.println("--------all companies employees data City wise-------------");

            HashMap<String, ArrayList<model.Employee>>  cityHashMap = new HashMap<>();

            for(String key : empHashMap.keySet()){

                ArrayList<model.Employee> employees =  empHashMap.get(key);

                for(model.Employee emp : employees){
                    String city = emp.getCity();

                    if(cityHashMap.containsKey(city)){

                        cityHashMap.get(city).add(emp);

                    } else{
                        ArrayList<model.Employee> cityEmployees = new ArrayList<>();
                        cityEmployees.add(emp);

                        cityHashMap.put(city,cityEmployees);
                    }
                }
            }
            for(String city : cityHashMap.keySet()){

                System.out.println("Data of employees in " + city + " is:");

                ArrayList<model.Employee> cityEmployees = cityHashMap.get(city);

                for(model.Employee emp : cityEmployees){

                    System.out.println("Name: " + emp.getName() + " Salary: " + emp.getSalary() + " Dept: " + emp.getDepartment());
                }
            }
            System.out.println( );

        }
        //5: display same salary Employees
        public void displaySameSalaryyEmp(HashMap<String, ArrayList<model.Employee>> empHashMap){
        }

        public static void main(String[] args) {

            Employee obj = new Employee();

            HashMap<String,ArrayList<model.Employee>> empHashMap = obj.createEmpHashMap();

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


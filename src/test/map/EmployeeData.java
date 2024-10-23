package test.map;

import model.Employee1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeData {

    public HashMap<String, ArrayList<Employee1>> createEmployeeMap(){
        HashMap<String, ArrayList<Employee1>>empmap =new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Employee's data to enter: ");
        int size=scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employee1> tcsEmployee=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.println("Enter details of employee: "+(i+1));
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

            Employee1 employee=new Employee1(name,salary,city,dept);
            tcsEmployee.add(employee);
        }
        empmap.put("TCS",tcsEmployee);

        System.out.println("Enter Number of Employee's data to enter: ");
        size=scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employee1> ibmEmployee=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.println("Enter details of employee: "+(i+1));
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

            Employee1 employee=new Employee1(name,salary,city,dept);
            ibmEmployee.add(employee);
    }
        empmap.put("IBM",ibmEmployee);

        System.out.println("Enter Number of Employee's data to enter: ");
        size=scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employee1> wiproEmployee=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.println("Enter details of employee: "+(i+1));
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

            Employee1 employee=new Employee1(name,salary,city,dept);
            wiproEmployee.add(employee);
    }
        empmap.put("WIPRO",wiproEmployee);

        System.out.println("Enter Number of Employee's data to enter: ");
        size=scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employee1> ctsEmployee=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.println("Enter details of employee: "+(i+1));
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

            Employee1 employee=new Employee1(name,salary,city,dept);
            tcsEmployee.add(employee);
    }
        empmap.put("CTS",ctsEmployee);

        return empmap;

}
//1.display employee who is having salary greater than 50,0000 and
// belong to pune city from IBM and TCS

    public void employees(HashMap<String,ArrayList<Employee1>>empMap){
        System.out.println("employee who is having salary greater than 50,0000 and belong to pune city from IBM and TCS");
        ArrayList<Employee1>employees=new ArrayList<>();
        for (String key: Arrays.asList("IBM","TCS")){
            ArrayList<Employee1> employee=empMap.get(key);

            for (Employee1 var: employee){
                if(var.getSalary()>50000 && var.getCity().equals("Pune")){
                    System.out.println("Company Name: "+key+" Employee Name: "+var.getName()+" Salary: "+var.getSalary()+" Ctiry: "+var.getCity()+"Department: "+var.getDept());
                    employees.add(var);
                }
            }
        }
        System.out.println("______________________________________________________________________________________________________");

    }

    //2.Highest and Lowest Salary
    public void empSal(HashMap<String,ArrayList<Employee1>>empMap){
        Employee1 highestSalaryEmployee=null;
        Employee1 LowestSalaryEmployee=null;
        for (String key:empMap.keySet()){
            ArrayList<Employee1>employees=empMap.get(key);
            for (Employee1 var: employees){
                if(highestSalaryEmployee==null||var.getSalary()>highestSalaryEmployee.getSalary()){
                    highestSalaryEmployee=var;
                }
                if (LowestSalaryEmployee==null ||var.getSalary()<LowestSalaryEmployee.getSalary()){
                    LowestSalaryEmployee=var;
                }
            }
        }
        System.out.println("2.Highest Salary Employee: ");
        System.out.println("Name: "+highestSalaryEmployee.getName()+" Salary: "+highestSalaryEmployee.getSalary()+" City: "+highestSalaryEmployee.getCity()+" Department: "+highestSalaryEmployee.getDept());

        System.out.println("Loest Salary Employee: ");
        System.out.println("Name: "+LowestSalaryEmployee.getName()+" Salary: "+LowestSalaryEmployee.getSalary()+" City: "+LowestSalaryEmployee.getCity()+" Department: "+LowestSalaryEmployee.getDept());

        System.out.println("_______________________________________________________________________");
    }
    //3,Company Wise data
    public void comapnyWise(HashMap<String,ArrayList<Employee1>>empMap){
        System.out.println("Company wise data: ");
        for (String key: empMap.keySet()){
            System.out.println("Employees of "+key+" comapny is: ");

            ArrayList<Employee1>employees=empMap.get(key);
            for (Employee1 var:employees){
                System.out.println("Name:" + var.getName()+" , " + "Salary:" + var.getSalary()+" , " + "City:" + var.getCity() + " , " +"Department:" + var.getDept());
            }
        }
        System.out.println("_______________________________________________________");

    }
    //4.Same city Employees
    public void sameCity(HashMap<String,ArrayList<Employee1>>empMap){
        System.out.println("Same City employees: ");

        HashMap<String,ArrayList<Employee1>>cityMap=new HashMap<>();
        for (String key:empMap.keySet()){
            ArrayList<Employee1>employees=empMap.get(key);
            for (Employee1 var:employees){
                String city=var.getCity();
                if(cityMap.containsKey(city)){
                    cityMap.get(city).add(var);
                }else{
                    ArrayList<Employee1>employee=new ArrayList<>();
                    employee.add(var);
                    cityMap.put(city,employee);
                }
            }
        }
        for (String city:cityMap.keySet()){
            System.out.println("Employees in : "+city+" is: ");
            ArrayList<Employee1>employee=cityMap.get(city);
            for (Employee1 var:employee){
                System.out.println("NAME:"+ var.getName()+" , "+ "SALARY:"+ var.getSalary()+ " , "+ "CITY:"+ var.getCity()+" , "+ "DEPARTMENT:"+ var.getDept());

            }
        }
        System.out.println("__________________________________________________________");
    }
    //5.Employees with same Salary for all companies

    public static void main(String[] args) {
        EmployeeData obj=new EmployeeData();
        HashMap<String,ArrayList<Employee1>>empMap=obj.createEmployeeMap();
        obj.employees(empMap);
        obj.empSal(empMap);
        obj.comapnyWise(empMap);
        obj.sameCity(empMap);
    }
}

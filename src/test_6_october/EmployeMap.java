package test_6_october;

import model.Employe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeMap {


    public HashMap<String, ArrayList<Employe>> createEmployeMap() {
        HashMap<String, ArrayList<Employe>> empMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF EMPLOYEE THAT YOU WANT TO ADD IN TCS");
        int size = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employe> tcsEmployee = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the details of employee:" + (i + 1));

            System.out.println("enter employee name:");
            Scanner scanner3 = new Scanner(System.in);
            String names = scanner3.nextLine();
            System.out.println("enter employee salary:");
            Scanner scanner4 = new Scanner(System.in);
            double salary = scanner4.nextDouble();
            System.out.println("enter employee city:");
            Scanner scanner1 = new Scanner(System.in);
            String city = scanner1.nextLine();
            System.out.println("enter employee dept:");
            Scanner scanner2 = new Scanner(System.in);
            String dept = scanner2.nextLine();

            Employe emp = new Employe(names, salary, city, dept);
            tcsEmployee.add(emp);
        }

        empMap.put("TCS", tcsEmployee);

        System.out.println("ENTER THE NUMBER OF EMPLOYEE THAT YOU WANT TO ADD IN IBM");
        size = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employe> ibmEmployee = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the details of employee:" + (i + 1));

            System.out.println("enter employee name:");
            Scanner scanner3= new Scanner(System.in);
            String names = scanner3.nextLine();
            System.out.println("enter employee salary:");
            Scanner scanner4= new Scanner(System.in);
            double salary = scanner4.nextDouble();
            System.out.println("enter employee city:");
            Scanner scanner1 = new Scanner(System.in);
            String city = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("enter employee dept:");
            String dept = scanner2.nextLine();

            Employe emp = new Employe(names, salary, city, dept);
            ibmEmployee.add(emp);
        }

        empMap.put("IBM", ibmEmployee);


        System.out.println("ENTER THE NUMBER OF EMPLOYEE THAT YOU WANT TO ADD IN WIPRO");
        size = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employe> wiproEmployee = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the details of employee:" + (i + 1));

            System.out.println("enter employee name:");
            Scanner scanner3 = new Scanner(System.in);
            String names = scanner3.nextLine();
            System.out.println("enter employee salary:");
            Scanner scanner4 = new Scanner(System.in);
            double salary = scanner4.nextDouble();
            System.out.println("enter employee city:");
            Scanner scanner1 = new Scanner(System.in);
            String city = scanner1.nextLine();
            System.out.println("enter employee dept:");
            Scanner scanner2 = new Scanner(System.in);
            String dept = scanner2.nextLine();

            Employe emp = new Employe(names, salary, city, dept);
            wiproEmployee.add(emp);
        }

        empMap.put("WIPRO", wiproEmployee);

        System.out.println("ENTER THE NUMBER OF EMPLOYEE THAT YOU WANT TO ADD IN CTS");
        size = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employe> ctsEmployee = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the details of employee:" + (i + 1));

            System.out.println("enter employee name:");
            Scanner scanner3 = new Scanner(System.in);
            String names = scanner3.nextLine();
            System.out.println("enter employee salary:");
            Scanner scanner4 = new Scanner(System.in);
            double salary = scanner4.nextDouble();
            System.out.println("enter employee city:");
            Scanner scanner1 = new Scanner(System.in);
            String city = scanner1.nextLine();
            System.out.println("enter employee dept:");
            Scanner scanner2 = new Scanner(System.in);
            String dept = scanner2.nextLine();

            Employe emp = new Employe(names, salary, city, dept);
            ctsEmployee.add(emp);
        }

        empMap.put("CTS", ctsEmployee);

        return empMap;
    }
//1.display employee who is having salary greater than 50,0000 and
// belong to pune city from IBM and TCS

    public void displayEmployee(HashMap<String, ArrayList<Employe>> empMap) {
        System.out.println("1).display employee who is having salary greater than 50,0000 and belong to pune city from IBM and TCS");
        ArrayList<Employe> displayEmployee = new ArrayList<>();
        for (String key : Arrays.asList("IBM","TCS")) {
            ArrayList<Employe> employees = empMap.get(key);

            for (Employe var : employees) {

                if (var.getSalary() > 500000 && var.getCity().equals("PUNE")) {
                    System.out.println("COMPANY NAME:" + key +"  :-> " + "NAME :" + var.getName()+" , " + "SALARY:" + var.getSalary() +" ,  " + "CITY:" + var.getCity() +" , " + "DEPARTMENT:" + var.getDepartment());
                    displayEmployee.add(var);
                }
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }


//2.write a method which will find highest salary employee and lowest salary employee

    public void findEmployee(HashMap<String, ArrayList<Employe>> empMap) {

        Employe highestSalaryEmployee = null;
        Employe lowestSalaryEmployee = null;
        for (String key : empMap.keySet()) {

            ArrayList<Employe> employees = empMap.get(key);
            for (Employe var : employees) {
                if (highestSalaryEmployee == null || var.getSalary() > highestSalaryEmployee.getSalary()) {
                    highestSalaryEmployee = var;
                }

                if (lowestSalaryEmployee == null || var.getSalary() < lowestSalaryEmployee.getSalary()) {
                    lowestSalaryEmployee = var;
                }
            }
        }
        System.out.println("2).EMPLOYEE WITH HIGHEST EMPLOYEE: ");
        System.out.println( " NAME:" + " " +highestSalaryEmployee.getName()+" , " + "Salary:" +" "+ highestSalaryEmployee.getSalary()+" ," + "city:" + " " +highestSalaryEmployee.getCity() +" "+ "department:" + " " +highestSalaryEmployee.getDepartment());


        System.out.println("EMPLOYEE WITH LOWEST EMPLOYEE:");
        System.out.println("NAME:" +" " + lowestSalaryEmployee.getName() +", " + "SALARY:" +" "+ lowestSalaryEmployee.getSalary()+" ," + "CITY:" +" "+ lowestSalaryEmployee.getCity() + " " +"DEPARTMENT:" +" "+ lowestSalaryEmployee.getDepartment());

        System.out.println("...........................................................................");
    }

//3.display companies with employees data company wise

    public void displayCompany(HashMap<String, ArrayList<Employe>> empMap) {
        System.out.println("3).display all companies employee data company wise ");
        for (String key : empMap.keySet()) {
            System.out.println("employee of  " + key + " company is :");

            ArrayList<Employe> employees = empMap.get(key);
            for (Employe var : employees) {
                System.out.println("NAME:" + var.getName()+" , " + "SALARY:" + var.getSalary()+" , " + "CITY:" + var.getCity() + " , " +"DEPARTMENT:" + var.getDepartment());
                }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    //4.display data employee together ,who is having same city

    public void sameCityEmployee(HashMap<String, ArrayList<Employe>> empMap){
        System.out.println("4).print same city employee together...");

        HashMap<String , ArrayList<Employe>>  cityMap = new HashMap<>();
        for(String key : empMap.keySet()) {

            ArrayList<Employe> employees = empMap.get(key);
            for(Employe var: employees ){
                String city = var.getCity();
                if(cityMap.containsKey(city)) {
                    cityMap.get(city).add(var);
                }
                else{
                    ArrayList<Employe> dataEmployee= new ArrayList<>();
                    dataEmployee.add(var);
                    cityMap.put(city,dataEmployee );
                }
            }
        }

        for(String city: cityMap.keySet()){
            System.out.println("data of employee in :"+ city +" is: ");
            ArrayList<Employe> dataEmployee = cityMap.get(city);
            for(Employe emp: dataEmployee){
                System.out.println("NAME:"+ emp.getName()+" , "+ "SALARY:"+ emp.getSalary()+ " , "+ "CITY:"+ emp.getCity()+" , "+ "DEPARTMENT:"+ emp.getDepartment());
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    //5.display all employees who is having same salary for all companies

  //  public void sameSalaryEmployee(HashMap<String , ArrayList<Employe>> empMap){

   //     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    //}
    public static void main(String[] args) {
        EmployeMap obj = new EmployeMap();

        HashMap<String, ArrayList<Employe>> empMap = obj.createEmployeMap();
        obj.displayCompany(empMap);
       obj.findEmployee(empMap);
        obj.displayEmployee(empMap);
        obj.sameCityEmployee(empMap);
    }







}

package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

    //Write a program to create Employee(name, Salary, City, Dept) HashMap
    //1.Insert all the data using Scanner with IBM, TCS , WIPRO AND CTS and
    // display employee who is having salary greater than 50,0000 and belongs to Pune city for IBM and TCS.
   // String : key , ArrayList<Employee>: value

  public  ArrayList<Employee> createEmployeeData(){

      // data :  number of record , emp data

      System.out.println("How many employee you want to enter:");
      Scanner scanner= new Scanner(System.in);
      int count=scanner.nextInt();

      ArrayList<Employee> employeeArrayList= new ArrayList<>();
      for(int i=0; i<count; i++){

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


    public static void main(String[] args) {

      Test obj= new Test();

        System.out.println("Please enter company name for which you want to create data");

        Scanner scanner= new Scanner(System.in);
        String company=scanner.nextLine();
        ArrayList<Employee> employeeArrayList=  obj.createEmployeeData();

        HashMap<String, ArrayList<Employee>> companyWiseData= new HashMap<>();
        companyWiseData.put(company,employeeArrayList);


    }
}

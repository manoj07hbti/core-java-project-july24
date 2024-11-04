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

  public void FindHighestLowestSalary(ArrayList<Employee> employeeArrayList){
      Double highestSalary=0.0;
      Double lowestSalary=0.0;

      // finding highest
      for( Employee emp: employeeArrayList){

          // here we are comparing salary with our highest salary, if our salary is not highest it means current emp salary is highest
          if(highestSalary<emp.getSalary()){
              highestSalary=emp.getSalary();
          }
      }
      System.out.println("We have found emp with Highest salary: "+highestSalary);


  }

  public void printSameCityEmployee(  HashMap<String, ArrayList<Employee>> companyWiseData){
      // we need to process two company data at a time

      System.out.println("which company data you want to compare");
      Scanner scanner= new Scanner(System.in);
      String company1= scanner.nextLine();
      System.out.println("which company data you want to compare");
      String company2= scanner.nextLine();

      ArrayList <Employee> company1Employee= companyWiseData.get(company1);
      ArrayList <Employee> company2Employee= companyWiseData.get(company2);

      for(Employee company1Emp : company1Employee){

          for(Employee company2Emp : company2Employee){

              if(company1Emp.getCity().equals(company2Emp.getCity())){

                  System.out.println("COMPANY 1: Name: "+company1Emp.getName()+" Salary :"+company1Emp.getSalary()+ " Dept: "+company1Emp.getDept() +" City: "+company1Emp.getCity());
                  System.out.println("COMPANY 2: Name: "+company2Emp.getName()+" Salary :"+company2Emp.getSalary()+ " Dept: "+company2Emp.getDept() +" City: "+company2Emp.getCity());

              }
          }
      }



  }

    public static void main(String[] args) {

        Test obj = new Test();
        String choice = "Y";
        HashMap<String, ArrayList<Employee>> companyWiseData = new HashMap<>();
        while (choice.equals("Y")) {
            System.out.println("Please enter company name for which you want to create data");

            Scanner scanner = new Scanner(System.in);
            String companyName = scanner.nextLine();
            ArrayList<Employee> employeeArrayList = obj.createEmployeeData();

            companyWiseData.put(companyName, employeeArrayList);

            for(String key: companyWiseData.keySet()){

                for(Employee emp: companyWiseData.get(key)){
                    System.out.println("Company name :"+key);
                    System.out.println("Name: "+emp.getName()+" Salary :"+emp.getSalary()+ " Dept: "+emp.getDept() +" City: "+emp.getCity());
                }
            }
            System.out.println("Do you want to add one more company data? Press Y to continue or any other to exit");
            Scanner scanner1= new Scanner(System.in);
            choice=scanner1.nextLine();


        }
       // calling highest lowest salary method
        obj.FindHighestLowestSalary(companyWiseData.get("IBM"));
       // calling same city method
       obj.printSameCityEmployee(companyWiseData);
    }
}

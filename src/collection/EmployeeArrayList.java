package collection;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployee(){

        ArrayList <Employee> employeeArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of employee data that you want to enter:");
        int size= scanner.nextInt();
       for(int i=0; i<size; i++){
           Scanner scanner1 = new Scanner(System.in);
           System.out.println("PLEASE ENTER DATA OF EMPLYOEE"+(i+1) + ":");

           System.out.println("NAME:");
           String names=scanner1.nextLine();

           System.out.println("AGE");
           int age=scanner1.nextInt();

           Scanner scanner2 = new Scanner(System.in);
           System.out.println("DEPARTMENT");
           String department= scanner2.nextLine();

           Employee emplyoee = new Employee(names,age,department);
           employeeArrayList.add(emplyoee);
        }
    return  employeeArrayList;
    }

    public static void main(String[] args) {
        EmployeeArrayList obj = new EmployeeArrayList();
        for(Employee var: obj.createEmployee()){
            System.out.println("NAME:"+ var.getName() + " " + "AGE:" + var.getAge() + " " + "DEPARTMENT:"+ var.getDepartment());
        }
    }



}

package collections.set;

import model.Employee;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeHashSet {

    public HashSet<Employee> createEmployeeSet(){
        Scanner sc = new Scanner(System.in);

        HashSet<Employee> employees = new HashSet<>();

        Employee e1= new Employee("Anshul",  1245 , "IT");
        Employee e2= new Employee("Anshul",  1245 , "IT");
        Employee e3= new Employee("Kunal",  4587 , "MBA");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        return employees;

    }

    public static void main(String[] args) {

        EmployeeHashSet obj = new EmployeeHashSet();

        for(Employee var : obj.createEmployeeSet()){
            System.out.println("Name: "+var.getName() +" Emp ID: "+var.getEmployeeId() + " Dept: "+var.getDepartment());
        }


    }
}

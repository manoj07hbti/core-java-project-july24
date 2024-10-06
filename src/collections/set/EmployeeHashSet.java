package collections.set;

import model.Employee2;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeHashSet {

    public HashSet<Employee2> createEmployeeSet(){
        Scanner sc = new Scanner(System.in);

        HashSet<Employee2> employee2s = new HashSet<>();

        Employee2 e1= new Employee2("Anshul",  1245 , "IT");
        Employee2 e2= new Employee2("Anshul",  1245 , "IT");
        Employee2 e3= new Employee2("Kunal",  4587 , "MBA");

        employee2s.add(e1);
        employee2s.add(e2);
        employee2s.add(e3);

        return employee2s;

    }

    public static void main(String[] args) {

        EmployeeHashSet obj = new EmployeeHashSet();

        for(Employee2 var : obj.createEmployeeSet()){
            System.out.println("Name: "+var.getName() +" Emp ID: "+var.getEmployeeId() + " Dept: "+var.getDepartment());
        }


    }
}

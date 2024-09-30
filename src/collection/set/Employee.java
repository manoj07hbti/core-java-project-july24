package collection.set;

import model.Doctor;
import model.Engineer;

import java.util.HashSet;
import java.util.Scanner;

public class Employee {
    public HashSet<model.Employee> createEmployeeList(){
        HashSet<model.Employee>employees=new HashSet<>();
        System.out.println("Please enter number of employee's data to enter: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Please enter name of employee: ");
            String name=scanner1.nextLine();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Please enter age of employee: ");
            int age=scanner2.nextInt();
            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter section of employee: ");
            String department=scanner3.nextLine();
            model.Employee employee=new model.Employee(name,age,department);
            employees.add(employee);

        }return employees;
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        for(model.Employee var:obj.createEmployeeList()){
            System.out.println("Printing Employee Name: "+var.getName()+" Age: "+var.getAge()+" Department: "+var.getDepartment());
        }
    }
}

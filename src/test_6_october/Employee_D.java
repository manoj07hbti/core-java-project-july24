package test_6_october;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_D {

    private static String getname;
    String Name;
    int age;
    float salary;
    String city;

    public void display() {
        System.out.println("name =" + "RASHMI");
        System.out.println(age = +31);
        System.out.println(salary = +500000);
        System.out.println("city =" + "PUNE");


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee_D obj = new Employee_D();

        obj.display();
        ArrayList<Employee> employees = new ArrayList<>();
        for (model.Employee emp : employees) {

            System.out.println("Name: " + Employee.getname + " Salary: " + Employee.getSalary + " City: " + Employee.getcity + " Dept: " + Employee.getDepartment());
        }

    }

}


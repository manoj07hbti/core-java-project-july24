package model;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Employee {
    public static String getSalary;
    public static String getname;
    public static String getcity;
    String name;
    int salary;
    static String department;
    String city;

    // param constructor


    public Employee(String name, int salary, String department, String city) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.city = city;
    }

    public Employee(String name, double salary, String city, String dept) {
    }

    public Employee(InputStream in) {
    }

    // method override


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department, city);
    }


    // gtter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HashMap<String, ArrayList<Employee>> empHashMap() {
return empHashMap();
    }

}

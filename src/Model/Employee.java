package Model;

import java.util.Objects;

public class Employee {

    String name;

    int age;

    String Department;

    double Salary;



    // param constructor

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        Department = department;
        Salary = salary;
    }


    //getter/setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return Department;
    }

    public double getSalary() {
        return Salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(Salary, employee.Salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(Department, employee.Department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Department, Salary);
    }
}

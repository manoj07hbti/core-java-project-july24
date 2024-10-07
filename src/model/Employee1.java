package model;

import java.util.Objects;

public class Employee1 {
    String name;
    int salary;
    String city;
    String dept;

    public Employee1(String name, int salary, String city, String dept) {
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return salary == employee1.salary && Objects.equals(name, employee1.name) && Objects.equals(city, employee1.city) && Objects.equals(dept, employee1.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, city, dept);
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

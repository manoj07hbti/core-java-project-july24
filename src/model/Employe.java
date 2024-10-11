package model;

import java.util.Objects;

public class Employe {

    String name;
    double salary;
    String city;
    String department;

    public Employe(String name, double salary, String city, String department) {
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Double.compare(salary, employe.salary) == 0 && Objects.equals(name, employe.name) && Objects.equals(city, employe.city) && Objects.equals(department, employe.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, city, department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

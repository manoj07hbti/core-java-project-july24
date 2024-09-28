package Model;

import java.util.Objects;

public class Employee {

    String name;
    int age;
    String Department;

    // param constructor


    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        Department = department;
    }

    //getter/setter


    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getDepartment() {return Department;}

    public void setDepartment(String department) {Department = department;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(Department, employee.Department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Department);
    }
}

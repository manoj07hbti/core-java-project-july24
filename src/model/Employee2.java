package model;

import java.util.Objects;

public class Employee2 {

    String name;
    int employeeId;
    String department;

    public Employee2(String name, int employeeId, String department){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    //We need to provide implementation of hash code method by overriding hash method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return employeeId == employee2.employeeId && Objects.equals(name, employee2.name) && Objects.equals(department, employee2.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeId, department);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

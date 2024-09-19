package model;

public class Employee {

    String name;
    int employeeId;
    String department;

    public Employee(String name, int employeeId, String department){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
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

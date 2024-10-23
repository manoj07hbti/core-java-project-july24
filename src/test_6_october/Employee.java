package test_6_october;

public class Employee {

    String name;
    String city;
    Double salary;
    String department;

    public Employee(String name, String city, Double salary, String department) {
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

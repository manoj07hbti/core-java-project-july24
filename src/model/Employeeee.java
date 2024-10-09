package model;

public class Employeeee {

    String name;
    int age;
    int salary;
    String dept;

    // param constructor



    public Employeeee(String name, int age, int salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    // getter/ setter


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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

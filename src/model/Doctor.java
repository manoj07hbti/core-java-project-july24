package model;

import java.util.Objects;

public class Doctor {

    String name;
    int age;
    String dept;
    int salary;


    // param constructor


    public Doctor(String name, int age, String dept, int salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    // we need to provide implementation of hashcode method by overriding hashcode method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && salary == doctor.salary && Objects.equals(name, doctor.name) && Objects.equals(dept, doctor.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dept, salary);
    }


    // getter/setter


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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

package model;

import java.util.Objects;

public class Student1 {
    String name;
    int age;
    String city;
    String dept;

    public Student1(String name, int age, String city, String dept) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(name, student1.name) && Objects.equals(city, student1.city) && Objects.equals(dept, student1.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city, dept);
    }

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

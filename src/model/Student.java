package model;

public class Student {
    public Student(String name, int age, String city, String dept) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.dept = dept;
    }

    String name;
    int age;
    String city;
    String dept;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

}

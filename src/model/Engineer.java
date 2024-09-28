package model;

import java.util.Objects;

public class Engineer {


    String name;
    int age;
    String city;
    String branch;


    // param constructor


    public Engineer(String name, int age, String city, String mbbs) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.branch = branch;
    }

    // we need to provide implementation of hash code method by overriding hashcode method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return age == engineer.age && Objects.equals(name, engineer.name) && Objects.equals(city, engineer.city) && Objects.equals(branch, engineer.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city, branch);
    }


    // getter setter

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
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
}



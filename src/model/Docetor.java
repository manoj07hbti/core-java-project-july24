package model;

import java.util.Objects;

public class Docetor {

    String name;
    int age;
    String speciality;
    String degree;


    // param constructor


    public Docetor(String name, int age, String speciality, String degree) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.degree = degree;
    }

    // we need to provide implementation of hash code method by overriding hashcode method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docetor docetor = (Docetor) o;
        return age == docetor.age && Objects.equals(name, docetor.name) && Objects.equals(speciality, docetor.speciality) && Objects.equals(degree, docetor.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, speciality, degree);
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
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
}




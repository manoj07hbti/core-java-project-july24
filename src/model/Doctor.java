package model;

public class Doctor {

    String name;
    int age;
    String speciality;
    String degree;

    // param constructor


    public Doctor(String name, int age, String speciality, String degree) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.degree = degree;
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

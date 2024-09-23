package model;

public class Engineer {


    String name;
    int age;
    String city;
    String branch;


    // param constructor


    public Engineer(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.branch = branch;
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



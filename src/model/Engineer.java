package model;

public class Engineer {

    String name;
    int age;
    String telecom;


    // param constructor


    public Engineer(String name, int age, String telecom) {
        this.name = name;
        this.age = age;
        this.telecom = telecom;
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

    public String getTelecom() {
        return telecom;
    }

    public void setTelecom(String telecom) {
        this.telecom = telecom;
    }
}

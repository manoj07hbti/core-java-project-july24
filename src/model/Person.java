package model;

public class Person {

    String name;
    int age;
    String field;


    // param constructor


    public Person(String name, int age, String field) {
        this.name = name;
        this.age = age;
        this.field = field;
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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}



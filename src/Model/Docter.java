package Model;

import java.util.Objects;

public class Docter {

    String name;

    int age;

    String Department;


    // param constructor


    public Docter(String name, int age, String department) {
        this.name = name;
        this.age = age;
        Department = department;
    }

    //getter/setter


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

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docter docter = (Docter) o;
        return age == docter.age && Objects.equals(name, docter.name) && Objects.equals(Department, docter.Department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Department);
    }
}

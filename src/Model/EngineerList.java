package Model;

import java.util.Objects;

public class EngineerList {

    String name;
    int age;
    String section;

    // param constructor



    public EngineerList(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public EngineerList() {
        
    }

    //getter/setter


    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getSection() {return section;}

    public void setcs(String cs) {this.section = section;}

    public String getcs() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineerList that = (EngineerList) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(section, that.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, section);
    }
}

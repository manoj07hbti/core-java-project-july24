package Model;

import java.util.Objects;

public class Teacher {

    String name;
    int age;
    String Section;

    // param constructor


    public Teacher(String name, int age, String section) {
        this.name = name;
        this.age = age;
        Section = section;
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

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name) && Objects.equals(Section, teacher.Section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Section);
    }
}

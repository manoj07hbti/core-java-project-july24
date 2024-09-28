package Model;

import java.util.Objects;

public class Doctor
{
    String name;
    int age;
    String field;

    public Doctor(String name, int age, String field)
    {
        this.name = name;
        this.age = age;
        this.field = field;
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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Objects.equals(name, doctor.name) && Objects.equals(field, doctor.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, field);
    }
}

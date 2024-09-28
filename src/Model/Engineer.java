package Model;

import java.util.Objects;

public class Engineer
{
    String name;
    int age;
    String field;

    public Engineer(String name, int age, String field)
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
        Engineer engineer = (Engineer) o;
        return age == engineer.age && Objects.equals(name, engineer.name) && Objects.equals(field, engineer.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, field);
    }
}

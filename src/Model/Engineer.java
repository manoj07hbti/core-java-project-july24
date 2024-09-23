package Model;

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
}

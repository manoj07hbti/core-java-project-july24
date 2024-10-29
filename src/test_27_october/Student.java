package test_27_october;

public class Student {

    String name;
    int age;
    String city;
    String section;

    public Student(String name, int age, String city, String section) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.section = section;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

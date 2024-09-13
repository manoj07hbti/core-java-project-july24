package class_oprion_param_constructor;

public class Student {
    String name;
    int age;
    String section;

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public static void main(String[] args) {
        Student student1=new Student ("Sahil",25,"CS");
        System.out.println("Name: "+student1.name+" , Age: "+student1.age+" , Section: "+student1.section);

    }
}

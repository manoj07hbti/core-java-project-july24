package class_and_object.param_constructor;

public class Student {

    String name;
    int age;
    String section;

    // parameterized constructor

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public static void main(String[] args) {
    //ClassName objName= new ClassName(value1, value2, value3.......valueN);
    Student student1= new Student("Rahul",22,"IT");
    Student student2= new Student("Mukesh",21,"CS");

  System.out.println("STUDENT 1:Name "+student1.name+" Age: "+student1.age+" Section: "+student1.section);
  System.out.println("STUDENT 2:Name "+student2.name+" Age: "+student2.age+" Section: "+student2.section);
    }

}

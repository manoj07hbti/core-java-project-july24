package class_and_object.param_constructor;

public class Person {
    String name;
    int age;
    String school;

    // PARAMETERIZED CONSTRUCTOR
    public Person(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

// SYNTAX ClassName ObjectName= NewClassName(value 1.....value2...);
    public static void main(String[] args) {
        Person object1 = new Person("VIKAS", 23, "CSS");
        Person object2 = new Person("HIMANSHU", 22, "DPS");
        Person object3 = new Person("KRISHNA YADAV", 25, "AQUA PUBLIC SCHOOL");
        Person object4 = new Person("ROHIT", 21, "MARRIED SCHOOL");
        Person object5 = new Person("PRIYANSHU", 20, "ARTIST SCHOOL");

        //  // object.propertyName;
        System.out.println("name..." + object1.name + "age..." + object1.age + "school..." + object1.school);

        System.out.println("name..." + object2.name + "age..." + object2.age + "school..." + object2.school);
        System.out.println("name..." + object3.name + "age..." + object3.age + "school..." + object3.school);
        System.out.println("name..." + object4.name + "age..." + object4.age + "school..." + object4.school);
        System.out.println("name..." + object5.name + "age..." + object5.age + "school..." + object5.school);

    }
}
package classes_and_object;

public class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person p1 =new  Person("Anshul", 22);
        Person p2 =new  Person("Abhinav", 12);
        Person p3 =new  Person("Abhishek", 45);
        Person p4 =new  Person("Kunal", 21);
        Person p5 =new  Person("Shivam", 56);


        System.out.println("Name- "+p1.name +" Age- "+p1.age);
        System.out.println("Name- "+p2.name +" Age- "+p2.age);
        System.out.println("Name- "+p3.name +" Age- "+p3.age);
        System.out.println("Name- "+p4.name +" Age- "+p4.age);
        System.out.println("Name- "+p5.name +" Age- "+p5.age);

    }
}

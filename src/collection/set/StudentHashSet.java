package collection.set;



import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    //TODO Create a method and take data using Scanner and send it back to main method...

    public static void main(String[] args) {

        HashSet <Student> students= new HashSet();

        Student student1= new Student("Rahul",21,"CS");
        System.out.println("hashcode of student1: "+student1.hashCode());

        Student student2= new Student("Rahul",21,"CS");
        System.out.println("hashcode of student2: "+student2.hashCode());

        Student student3= new Student("Rohit",21,"CS");
        System.out.println("hashcode of student3: "+student3.hashCode());

        Student student4= new Student("Rohit",22,"CS");
        System.out.println("hashcode of student4: "+student4.hashCode());

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student var: students){

            System.out.println(" Name :"+var.getName()+" Age:"+var.getAge()+" Section: "+var.getSection());
        }
    }

}

package collection.set;



import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    //TODO Create a method and take data using Scanner and send it back to main method...

    public static void main(String[] args) {

        HashSet <Student> students= new HashSet();

        Student student1= new Student("Rahul",21,"CS");
        Student student2= new Student("Rahul",21,"CS");
        Student student3= new Student("Rohit",21,"CS");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student var: students){

            System.out.println(" Name :"+var.getName()+" Age:"+var.getAge()+" Section: "+var.getSection());
        }
    }

}

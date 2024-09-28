package collections.set;

import model.Student;

import java.util.HashSet;

public class StudentHashCode {

    public static void main(String[] args) {
        HashSet<Student> students=new HashSet<>();

        Student student1= new Student("Ishank", 24, "IT");
        System.out.println("Hashcode os student1...."+student1.hashCode());
        Student student2=new Student("Ishank" , 24 , "IT");
        System.out.println("Hashcode of student2...."+student2.hashCode());
        Student student3=new Student("Riyaz" , 25, "MBBS");
        System.out.println("Hashcode of student3..."+student3.hashCode());
        students.add(student1);
        students.add(student2);
        students.add(student3);


        for(Student var:students){
            System.out.println(" Name " +var.getName() + " Age " +var.getAge() + " Section " +var.getSection());
        }



    }



}

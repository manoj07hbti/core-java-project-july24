package collection.set;

import model.Student;



import java.util.HashSet;
import java.util.Scanner;



public class StudentHashSet {

    public HashSet<Student> createStudentSet() {

        Scanner scanner = new Scanner(System.in);

        HashSet<Student>Student = new HashSet<>();

        System.out.println("Please enter data    of  Student you want to enter.");

        int numberofstudent = scanner.nextInt();
        for (int i = 0; i < numberofstudent; i++) {
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Enter student name ..."+i);

            String name = scanner1.nextLine();

            System.out.println("Age...");
            int age = scanner.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("section..");

            String section = scanner2.nextLine();
            Student student = new Student(name, age, section);
            Student.add(student);

                Student student1 = new Student("rahul", 33, "CS");
                Student student2 = new Student("rashmi", 31, "it");
                Student student3 = new Student("rahul", 33, "CS");

                Student.add(student1);
                Student.add(student2);
                Student.add(student3);

        }

        return Student;


    }

    public static void main(String[] args) {
        HashSet <Student>students=new HashSet();

        StudentHashSet obj=new StudentHashSet();

        for(Student var:obj.createStudentSet()){

           
           System.out.println("NAME : " +var.getName()+ "Age :"+ var.getAge()+"Section: "+var.getSection());
          System.out.println("printing student hashset.."+var);
       }

    }
}
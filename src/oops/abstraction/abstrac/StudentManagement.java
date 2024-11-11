package oops.abstraction.abstrac;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class StudentManagement {
    public ArrayList<Student> addStudent(){
        ArrayList<Student>studentList=new ArrayList<>();
        System.out.println("Please enter number of students to enter:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for (int i=0;i<size;i++){
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter Name:");
            String name= scanner1.nextLine();

            Scanner scanner2= new Scanner(System.in);
            System.out.println("Please enter Age:");
            int age=scanner2.nextInt();

            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter section:");
            String section= scanner3.nextLine();

            Student student=new Student(name,age,section);
            studentList.add(student);

            System.out.println("Name: "+student.getName()+" Age: "+student.getAge()+" Section: "+student.getSection());
        }
        return studentList;
    }
    public abstract void payfee();

    public abstract void displayResult();
}

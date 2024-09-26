package collection.set;

import java.util.HashSet;
import java.util.Scanner;

public class Student {
    public HashSet<model.Student> createStudentList(){
        HashSet<model.Student>students=new HashSet<>();
        System.out.println("Please enter number of students to enter: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Please enter name of student: ");
            String name=scanner1.nextLine();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Please enter age of student: ");
            int age=scanner2.nextInt();
            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter section of student: ");
            String section=scanner3.nextLine();
            model.Student student=new model.Student(name,age,section);
            students.add(student);

        }return students;
    }

    public static void main(String[] args) {
        Student obj=new Student();
        for(model.Student var:obj.createStudentList()){
            System.out.println("Printing Student Name: "+var.getName()+" Age: "+var.getAge()+" Section: "+var.getSection());
        }
    }
}

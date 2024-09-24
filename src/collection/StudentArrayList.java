package collection;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
    public ArrayList<Student>createStudentList(){
        ArrayList<Student>studentArrayList=new ArrayList<>();
        System.out.println("Please enter number of students to enter: ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        for (int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Please enter name: ");
            String name=scanner1.nextLine();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Please enter age:");
            int age=scanner2.nextInt();
            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter section: ");
            String section=scanner3.nextLine();
            Student student=new Student(name,age,section);
            studentArrayList.add(student);
        }


        return studentArrayList;
    }

    public static void main(String[] args) {
        StudentArrayList obj=new StudentArrayList();
        for(Student student:obj.createStudentList()){
            System.out.println("Student Name: "+student.getName()+" Age: "+student.getAge()+" Department: "+student.getSection());


    }
    }
}

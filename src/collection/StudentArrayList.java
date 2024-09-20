package collection;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

    public ArrayList<Student> createStudent(){

     ArrayList <Student> studentArrayList = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of student that you want to enter:");
        int size= scanner.nextInt();
        for(int i=0; i<size; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("ENTER DATA OF STUDENT:"+(i+1)+": ");

            System.out.println("NAME:");
           String name= scanner1.nextLine();

            System.out.println("AGE:");
          int age=  scanner1.nextInt();


            System.out.println("MARKS:");
           double marks= scanner1.nextDouble();

           Student student = new Student( name, age, marks);
            studentArrayList.add(student);
        }
return  studentArrayList;

    }

    public static void main(String[] args) {
        StudentArrayList obj = new StudentArrayList();
        for(Student var: obj.createStudent()){
            System.out.println("NAMES:"+ var.getName()+ " " + "AGE:"+var.getAge()+ " "+ "MARKS:"+ var.getMarks());
        }
    }
}

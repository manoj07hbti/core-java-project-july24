package collection;



import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

    public ArrayList<Student> createStudent() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the number of student thats you want to enter");

        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("data of student:" + (i + 1));

            System.out.println("name");
            String name = scanner1.nextLine();

            System.out.println("age");
            int age = scanner1.nextInt();

            System.out.println("marks");
            int marks = scanner1.nextInt();


        }

   return studentArrayList;
    }


    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();

        for(Student var: obj.createStudent()){

            System.out.println("name"+var.getName()+"age"+var.getAge()+"marks"+var.getSection());
        }

    }
}
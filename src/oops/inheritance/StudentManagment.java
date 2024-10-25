package oops.inheritance;

import model.Students;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class StudentManagment {


    public ArrayList<Students> addStudent() {

        ArrayList<Students> studentList = new ArrayList<>();
        System.out.println("How many students do you want to add ?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("ENTER DATA OF STUDENT: " + (i + 1));

            System.out.println("SCHOOL NAME:");
            String schoolName = scanner1.nextLine();

            System.out.println("NAME");
            String name = scanner1.nextLine();

            System.out.println("AGE");
            int age = scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("COURSE");
            String course = scanner2.nextLine();

            Students students = new Students(name, age, course, schoolName);
            studentList.add(students);

        }

        return studentList;
    }

    public abstract void payfee();

    public abstract void displayResult();

}

package collections;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

    public ArrayList<Student> createStudentList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        System.out.println("Please enter number of students...");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter detail of students..." + i);

            System.out.print("Name...");
            String name = scanner1.nextLine();

            System.out.print("Age..");
            int age = scanner.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Section...");
            String section = scanner2.nextLine();


            Student student = new Student(name, age, section);
            studentArrayList.add(student);
        }

        return studentArrayList;
    }


    public static void main(String[] args) {
        StudentArrayList obj = new StudentArrayList();

        for (Student var : obj.createStudentList()) {
            System.out.println("Printing using loop.." + var.getName() + "Age  " + var.getAge() + "Section..." + var.getSection());
        }
    }

}

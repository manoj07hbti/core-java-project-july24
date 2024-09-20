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
            System.out.println("Enter detail of students..." + i);

            System.out.print("Name...");
            String name = scanner.nextLine();

            System.out.print("Age..");
            int age = scanner.nextInt();

            System.out.print("Section...");
            String section = scanner.nextLine();
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

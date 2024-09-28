package collections.set;

import model.Student;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class StudentHashSet {

    public HashSet<Student> createStudentSet() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> students = new HashSet<>();
        System.out.println("Please enter number of students you want to add..");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter name of student.." + i);
            String name = scanner1.nextLine();

            System.out.println("Age...");
            int age = scanner.nextInt();
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("SEction..");

            String section = scanner2.nextLine();

            Student student = new Student(name, age, section);
            students.add(student);

        }
        return students;
    }

    public static void main(String[] args) {
        StudentHashSet obj = new StudentHashSet();
        for (Student var : obj.createStudentSet()) {
            System.out.println(" Printing student name " + var.getName() + " Age " + var.getAge() + " Section " + var.getSection());
        }
    }


}

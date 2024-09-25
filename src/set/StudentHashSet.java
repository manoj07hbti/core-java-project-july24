package set;

import model.Student;

import java.util.HashSet;
import java.util.Scanner;

public class StudentHashSet {
        HashSet<Student> createStudentHash() {
            HashSet<Student> studentHashSet = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter the number of student that you want to enter:");
            int size = scanner.nextInt();
            for (int i = 0; i < size; i++) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("ENTER DATA OF STUDENT:" + (i + 1) + ": ");

                System.out.println("NAME:");
                String name = scanner1.nextLine();

                System.out.println("AGE:");
                int age = scanner1.nextInt();


                System.out.println("MARKS:");
                double marks = scanner1.nextDouble();

                Student students = new Student(name, age, marks);
                studentHashSet.add(students);
            }
            return studentHashSet;
        }

        public static void main(String[] args) {
            StudentHashSet obj = new StudentHashSet();
            for (Student var : obj.createStudentHash()) {
                System.out.println("NAMES:" + var.getName() + " " + "AGE:" + var.getAge() + " " + "MARKS:" + var.getMarks());
            }
        }
    }


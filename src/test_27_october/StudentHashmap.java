package test_27_october;

import model.Student1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentHashmap {

    // Write a program to create Student(name, age, City, Dept) HashMap

    public ArrayList<Student1> createStudentArraylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Student You Want To add");
        int number = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Student1> student1ArrayList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter Student Name");
            String name = scanner3.nextLine();
            System.out.println("Enter Student Age");
            int age = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter Student City");
            String city = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter Student Dept");
            String dept = scanner2.nextLine();
            Student1 student1 = new Student1(name, age, city, dept);
            student1ArrayList.add(student1);

        }
        System.out.println("\n\n\n");

        return student1ArrayList;
    }

    public void displayStudent(HashMap<String, ArrayList<Student1>> universityWise) {
        for (String key : universityWise.keySet()) {
            if (key.equals("AMU") || key.equals("JMU")) {
                ArrayList<Student1> student1ArrayList = universityWise.get(key);
                for (Student1 student1 : student1ArrayList) {
                    if (student1.getAge() <= 25 && student1.getCity().equals("PUNE")) {
                        System.out.println("University Wise: " + key + "Name: " + student1.getName() + "Age: " + student1.getAge() + "City: " + student1.getCity() + "Dept: " + student1.getDept());
                    }
                }
            }
        }
    }

    public void highestLowestAge(HashMap<String, ArrayList<Student1>> universityWise) {
        int highestAgeStudent = 0;
        int lowestAgeStudent = 0;
        for (String key : universityWise.keySet()) {
            ArrayList<Student1> student1ArrayList = universityWise.get(key);
            if (key.equals("AMU") || key.equals("JMU")) {
                for (Student1 student1 : student1ArrayList) {
                    if (highestAgeStudent < student1.getAge()) {
                        highestAgeStudent = student1.getAge();
                        System.out.println("HIGHEST STUDENT AGE" + highestAgeStudent);
                        System.out.println("Name: " + student1.getName() + "Age: " + student1.getAge() + "City: " + student1.getCity() + "Dept: " + student1.getDept());

                        if (lowestAgeStudent > student1.getAge()) {
                            lowestAgeStudent = student1.getAge();
                            System.out.println("LOWEST STUDENT AGE" + lowestAgeStudent);
                            System.out.println("Name; " + student1.getName() + "Age: " + student1.getAge() + "City: " + student1.getCity() + "Dept: " + student1.getDept());

                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        StudentHashmap object = new StudentHashmap();
        object.createStudentArraylist();

    }
}



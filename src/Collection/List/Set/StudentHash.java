package Collection.List.Set;

import Model.Student;

import java.util.HashSet;
import java.util.Scanner;

public class StudentHash {


      public HashSet<Student> StudentHash() {

        HashSet<Student> Student = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter how many student do you want");

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("student data enter" + (i+1));


            System.out.println("NAME");
            String name = scanner1.nextLine();


            System.out.println("AGE");
            int age = scanner.nextInt();

            Scanner scanner2 = new Scanner(System.in);

            System.out.println("PERCENTAGE");
            double percentage = scanner2.nextDouble();

           Student student= new Student(name , age , percentage);

           Student.add(student);
        }
           return Student;
    }

    public static void main(String[] args) {

        StudentHash obj = new StudentHash();

        for (Student var : obj.StudentHash()) {

            System.out.println("NAME..." + var.getName() + "AGE.." + var.getAge() + "PERCENTAGE..." + var.getPercentage());
        }
    }


}

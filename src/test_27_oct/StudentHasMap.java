package test_27_oct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentHasMap {



    public ArrayList<Student> createStudentData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students you want to add...");
        int number = scanner.nextInt();
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter name..");
            String name = scanner1.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter age");
            int age = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter city");
            String city = scanner3.nextLine();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Enter section");
            String section = scanner4.nextLine();
            Student student = new Student(name, age, city, section);
            studentArrayList.add(student);
        }
        return studentArrayList;
    }
    public void displayStudent(HashMap<String, ArrayList<Student>> studentUniversityWise) {
        for (String key : studentUniversityWise.keySet()) {
            if (key.equals("JNU") || key.equals("AMU")) {
                ArrayList<Student> studentArrayList = studentUniversityWise.get(key);
                for (Student student : studentArrayList) {
                    if (student.getAge() <= 25 && student.getCity().equals("PUNe")) {
                        System.out.println(" UNIVERSITY WISE " + key + " Name " + student.getName() + " AGe " + student.getAge() + " CITY " + student.getCity() + " dept " + student.getDept());
                    }
                }
            }
        }
    }
    public void highestLowestAge(HashMap<String, ArrayList<Student>> studentUniversityWise) {
        int highestAgeStudent = 0;
        int lowestAgeStudent = 0;
        for (String key : studentUniversityWise.keySet()) {
            ArrayList<Student> studentArrayList = studentUniversityWise.get(key);
            if (key.equals("JNU") || key.equals("AMU")) {
                for (Student student : studentArrayList) {
                    if (highestAgeStudent < student.getAge()) {
                        highestAgeStudent = student.getAge();
                        System.out.println("HIGHEST STUDENT AGE " + highestAgeStudent);
                        System.out.println(" NAme " + student.getName() + " Age " + student.getAge() + " City " + student.getCity() + " dept " + student.getDept());
                        if (lowestAgeStudent > student.getAge()) {
                            lowestAgeStudent = student.getAge();
                            System.out.println("LOWEST AGE STUDENT " + lowestAgeStudent);
                            System.out.println(" Name " + student.getName() + " AGE " + student.getAge() + " CITY " + student.getCity() + " dept " + student.getDept());
                        }
                    }
                }
            }
        }
    }
    public void sameCityStudent(HashMap<String, ArrayList<Student>> studentUniversityWise) {
        System.out.println("Which company you want to comapre.");
        Scanner scanner = new Scanner(System.in);
        String u1 = scanner.nextLine();
        System.out.println("Which other comapny you want to compare");
        Scanner scanner1 = new Scanner(System.in);
        String u2 = scanner1.nextLine();
        ArrayList<Student> u1Student = studentUniversityWise.get(u1);
        ArrayList<Student> u2Student = studentUniversityWise.get(u2);
        for (Student student1 : u1Student) {
            for (Student student2 : u2Student) {
                if (student1.getCity().equals(student2.getCity())) {
                    System.out.println("UNIVERSITY 1 : Name " + student1.getName() + " Age " + student1.getAge() + " CIty " + student1.getCity() + " dept" + student1.getDept());
                    System.out.println("UNIVERSITY 2 : NAme " + student2.getName() + " Age " + student2.getAge() + " City " + student2.getCity() + " Section " + student2.getDept());
                }
            }
        }
    }
    public void sameAgeStudent(HashMap<String, ArrayList<Student>> studentUniversityWise) {
        ArrayList<Student> jnuStudent = studentUniversityWise.get("JNU");
        ArrayList<Student> amuStudent = studentUniversityWise.get("AMU");
        for (Student student1 : jnuStudent) {
            for (Student student2 : amuStudent) {
                if (student1.getAge() == student2.getAge()) {
                    System.out.println("JNU UNIVERSITY : NAme " + student1.getName() + " Age " + student1.getAge() + " City " + student1.getCity() + " dept " + student1.getDept());
                    System.out.println("AMU UNIVERSITY : Name " + student2.getName() + " Age " + student2.getAge() + " City " + student2.getCity() + " dept " + student2.getDept());
                }
            }
        }
    }
    public static void main(String[] args) {
        StudentHasMap obj = new StudentHasMap();
        String choice = "Y";
        HashMap<String, ArrayList<Student>> studentUniversityWise = new HashMap<>();
        while (choice.equals("Y")) {
            System.out.println("Please enter university name for which you want to create data of student");
            Scanner scanner = new Scanner(System.in);
            String universityName = scanner.nextLine();
            ArrayList<Student> studentArrayList = obj.createStudentData();
            studentUniversityWise.put(universityName, studentArrayList);
            for (String key : studentUniversityWise.keySet()) {
                for (Student student : studentUniversityWise.get(key)) {
                    System.out.println("UNIVERSITY NAME " + key);
                    System.out.println(" NAme " + student.getName() + " AGE " + student.getAge() + " CITY " + student.getCity() + " dept " + student.getDept());
                }
            }
            System.out.println("Do you want add more university press Y and to leave press any key");
            Scanner scanner1 = new Scanner(System.in);
            choice = scanner1.nextLine();
        }

        obj.displayStudent(studentUniversityWise);

        obj.highestLowestAge(studentUniversityWise);

        obj.sameAgeStudent(studentUniversityWise);

        obj.sameCityStudent(studentUniversityWise);
    }
}


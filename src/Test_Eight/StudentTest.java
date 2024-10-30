package Test_Eight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentTest {

    public ArrayList <Student> createStudentData() {

        System.out.println("Enter a value of adding students data:");
        Scanner scanner= new Scanner(System.in);
        int count= scanner.nextInt();

        ArrayList <Student> studentArrayList= new ArrayList<>();
        for (int i=0; i< count; i++){

            Scanner scanner1= new Scanner(System.in);
            System.out.println("Enter student's name:");
            String name= scanner1.nextLine();

            System.out.println("Enter student's age:");
            int age= scanner1.nextInt();

            Scanner scanner2= new Scanner(System.in);
            System.out.println("Enter student's city:");
            String city= scanner2.nextLine();

            System.out.println("Enter student's department:");
            String department= scanner2.nextLine();

            Student student= new Student(name, age, city, department);
            studentArrayList.add(student);
        }
        return studentArrayList;
    }

    public void studentsPuneData(HashMap<String, ArrayList<Student>> studentFilterPune) {
        System.out.println("Students who is having an age above 25 and belongs to JNU and AMU, Pune");
        for (String key : studentFilterPune.keySet()) {
            if (key.equalsIgnoreCase("JNU") || key.equalsIgnoreCase("AMU")){
                ArrayList<Student> studentArrayList = studentFilterPune.get(key);

                for (Student student : studentArrayList){
                    if (student.getAge() >= 25 && student.getCity().equalsIgnoreCase("Pune")) {
                        System.out.println("Company: "+key+" Name: "+student.getName()+" Age: "+student.getAge()+" City: "+student.getCity()+" Department: "+student.getDepartment());
                    }
                }
            }
        }
    }

    public void ageFilteringStudents(HashMap<String, ArrayList<Student>> studentsFilterPune) {
        int mostAged = 0;
        int leastAged = 0;

        for (String key : studentsFilterPune.keySet()) {
            ArrayList<Student> studentArrayList = studentsFilterPune.get(key);

            if (key.equalsIgnoreCase("JMU") || key.equalsIgnoreCase("AMU")) {
                for (Student student : studentArrayList) {
                    if (mostAged < student.getAge()) {
                        mostAged = student.getAge();

                        System.out.println("Most aged student: ");
                        System.out.println("Name: " + student.getName() + " Age: " + student.getAge() + " City: " + student.getCity() + " Department: " + student.getDepartment());

                        if (leastAged > student.getAge()) {
                            leastAged = student.getAge();
                            System.out.println("Least aged student: ");
                            System.out.println("Name: " + student.getName() + " Age: " + student.getAge() + " City: " + student.getCity() + " Department: " + student.getDepartment());
                        }
                    }
                }
            }
        }
    }

    public void sameAgedStudents(HashMap<String, ArrayList<Student>> studentsFilterPune) {
        ArrayList <Student> jnuStudent = studentsFilterPune.get("JNU");
        ArrayList <Student> amuStudent = studentsFilterPune.get("AMU");
        for (Student student1: jnuStudent) {
            for (Student student2: amuStudent) {
                if (student1.getAge() == student2.getAge()) {
                    System.out.println("Name: " + student1.getName() + " Age: " + student1.getAge() + " City: " + student1.getCity() + " Department: " + student1.getDepartment());
                    System.out.println("Name: " + student2.getName() + " Age: " + student2.getAge() + " City: " + student2.getCity() + " Department: " + student2.getDepartment());
                }
            }
        }
    }

    public void sameCityStudents(HashMap<String, ArrayList<Student>> studentsFilterPune) {
        System.out.println("enter Company 1 to compare: ");
        Scanner scanner = new Scanner(System.in);
        String university1 = scanner.nextLine();

        System.out.println("enter Company 1 to compare: ");
        Scanner scanner1 = new Scanner(System.in);
        String university2 = scanner1.nextLine();

        ArrayList <Student> university1Student = studentsFilterPune.get(university1);
        ArrayList <Student> university2Student = studentsFilterPune.get(university2);

        for (Student student1 : university1Student) {
            for (Student student2 : university2Student) {
                if (student1.getCity().equals(student2.getCity())) {
                    System.out.println("University One Student's Name: "+student1.getName()+" Age: "+student1.getAge()+" City: "+student1.getCity()+" Department"+student1.getDepartment());
                    System.out.println("University Two Student's Name: "+student2.getName()+" Age: "+student2.getAge()+" City: "+student2.getCity()+" Department"+student2.getDepartment());
                }
            }
        }
    }
    public static void main(String[] args) {
        StudentTest obj= new StudentTest();
        String choice = "Y";
        HashMap <String , ArrayList<Student>> studentsFilterPune = new HashMap<>();
        while (choice.equalsIgnoreCase("Y")) {
            System.out.println("Enter a university's name to create it's student data: ");
            Scanner scanner = new Scanner(System.in);
            String universityName = scanner.nextLine();
            ArrayList <Student> studentArrayList = obj.createStudentData();

            studentsFilterPune.put(universityName, studentArrayList);

            for (String key: studentsFilterPune.keySet()) {
                for (Student student : studentsFilterPune.get(key)) {
                    System.out.println("University Name: "+key);
                    System.out.println("Name: "+student.getName()+" Age: "+student.getAge()+" City: "+student.getCity()+" Department: "+student.getDepartment());
                }
            }
            System.out.println("Press Y to enter more data or press any key to exit: ");
            Scanner scanner1 = new Scanner(System.in);
            choice = scanner1.nextLine();
        }
        obj.studentsPuneData(studentsFilterPune);
        obj.ageFilteringStudents(studentsFilterPune);
        obj.sameAgedStudents(studentsFilterPune);
        obj.sameCityStudents(studentsFilterPune);
    }
}

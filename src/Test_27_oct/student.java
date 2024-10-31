package Test_27_oct;

import Model.Student1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class student {


    public ArrayList<Student1> createStudentData() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("how much student you want to enter ?");

        int number = scanner.nextInt();

        ArrayList<Student1> Student1Arraylist = new ArrayList<>();

        for (int k = 0; k < number; k++) {


            Scanner scanner1 = new Scanner(System.in);

            System.out.println("name");
            String name = scanner1.nextLine();

            System.out.println("age");
            int age = scanner1.nextInt();

            System.out.println("city");

            Scanner scanner2 = new Scanner(System.in);
            String city = scanner2.nextLine();

            System.out.println("dept");

            Scanner scanner3 = new Scanner(System.in);
            String dept = scanner3.nextLine();

            Student1 student1 = new Student1(name, age, city, dept);
            Student1Arraylist.add(student1);
        }
        return Student1Arraylist;

    }
    //Q 01

    public void desplayStudent(HashMap<String, ArrayList<Student1>> studentuniversitywise) {

        System.out.println("display student who is having age greater than 25 and belongs" +
                " to Pune city for JNU and AMU..");

        for (String key : studentuniversitywise.keySet()) {
            if (key.equals("JNU") || key.equals("DU")) {

                ArrayList<Student1> student1ArrayList =
                        studentuniversitywise.get(key);


                for (Student1 student : student1ArrayList) {

                    if (student.getAge() <= 24 && student.getCity().equals("pune")) {
                        System.out.println("company Name :" + key + "NAME :" + student.getName() + "Age :"
                                + student.getAge() + "CITY: " + student.getCity()
                                + "DEPARTMENT" + student.getDept());

                    }
                }
            }

        }
    }


    // Q 02  highest age and lowest age student in JNU and AMU

    public void highestLowestAge(HashMap<String, ArrayList<Student1>> studentuniversitywise) {

        System.out.println("HIGHEST AND LOWEST AGE....");

        int highestAgeStudent = 0;
        int lowestAgeStudent = 0;

        for (String key : studentuniversitywise.keySet()) {

            ArrayList<Student1> student1ArrayList = studentuniversitywise.get(key);

            if (key.equals("JNU") || key.equals("AMU")) {

                for (Student1 student : student1ArrayList) {
                    if (highestAgeStudent < student.getAge()) {
                        highestAgeStudent = student.getAge();
                    }
                    System.out.println("STUDENT HIGHEST AGE:" + highestAgeStudent);

                    System.out.println("NAME" + student.getName() + "AGE:" + student.getAge()
                            + "CITY:" + student.getCity() + "DEPT:" + student.getDept());

                    if (lowestAgeStudent > student.getAge()) ;
                    lowestAgeStudent = student.getAge();

                    System.out.println("STUDENT LOWEST AGE:" + lowestAgeStudent);

                    System.out.println("NAME:" + student.getName() + "AGE:" + student.getAge()
                            + "CITY:" + student.getCity() + "DePT:" + student.getDept());

                }
            }
        }
    }


    // Q 03

    public void Studentuniversity(HashMap<String, ArrayList<Student1>> studentUniversitywise) {

        System.out.println("STUENTS UNIVERSITYWISE DATA...");

        for (String key : studentUniversitywise.keySet()) {
            System.out.println("UNIVERSITY WISE" + key);

            ArrayList<Student1> student1ArrayList = studentUniversitywise.get(key);

            for (Student1 student : student1ArrayList) {

                System.out.println("NAME.." + student.getName() + "AGE.." + student.getAge()
                        + "CITY.." + student.getCity() + "DEPT.." + student.getDept());
            }
        }

    }


    // Q 04


    public void sameCity(HashMap<String, ArrayList<Student1>> studentUniversitywise) {

        System.out.println("SAME CITY...");
        Scanner scanner = new Scanner(System.in);
        String university1 = scanner.nextLine();

        System.out.println("another City...");
        Scanner scanner1 = new Scanner(System.in);
        String university2 = scanner1.nextLine();

        ArrayList<Student1> universitywise1 = studentUniversitywise.get(university1);
        ArrayList<Student1> universitywise2 = studentUniversitywise.get(university2);

        for (Student1 USW1 : universitywise1) {
            for (Student1 USW2 : universitywise2) {
                if (USW1.getCity().equals(USW2.getCity())) {

                    System.out.println("NAME.." + USW1.getName() + "AGE.." + USW1.getAge()
                            + "CITY.." + USW1.getCity() + "DEPT.." + USW1.getDept());

                    System.out.println("NAME.." + USW2.getName() + "AGE.." + USW2.getAge()
                            + "CITY.." + USW2.getCity() + "DEPT.." + USW2.getDept());


                }
            }
        }
    }


    //Q 05


    public void sameAge(HashMap<String, ArrayList<Student1>> studentUniversitywise) {

        System.out.println("SAME AGE IN AMU and JNU..");

        ArrayList<Student1> jnu = studentUniversitywise.get("JNU");
        ArrayList<Student1> amu = studentUniversitywise.get("AMU");

        for (Student1 USW1 : jnu) {
            for (Student1 USW2 : amu) {

                if (USW1.getAge() == USW2.getAge()) {
                    System.out.println("JNU NAME.." + USW1.getName() + "AGE.." + USW1.getAge()
                            + "CITY.." + USW1.getCity() + "DEPT.." + USW1.getDept());

                    System.out.println("AMU NAME.." + USW2.getName() + "AGE.." + USW2.getAge()
                            + "CITY.." + USW2.getCity() + "DEPT.." + USW2.getDept());

                }
            }
        }
    }


    public static void main(String[] args) {

        student obj = new student();
        String choice = "Y";
        HashMap<String, ArrayList<Student1>> studentuniversitywise = new HashMap<>();

        while (choice.equals("Y")) ;
        System.out.println("UNIVERSITY NAME DATA...");

        Scanner scanner = new Scanner(System.in);
        String universityName = scanner.nextLine();
        ArrayList<Student1> student1ArrayList = obj.createStudentData();

        studentuniversitywise.put(universityName, student1ArrayList);

        for (String key : studentuniversitywise.keySet()) {


            for (Student1 student : studentuniversitywise.get(key)) {

                System.out.println("universityName.." + key);

                System.out.println("Name.." + student.getName() + "Age.." + student.getAge()
                        + "City.." + student.getCity() + "Dept.." + student.getDept());


            }
        }
        System.out.println("add one more university ,press..Y..: if not press any other key");

        Scanner scanner4 = new Scanner(System.in);
       choice = scanner4.nextLine();

        obj.desplayStudent(studentuniversitywise);

        obj.highestLowestAge(studentuniversitywise);

        obj.Studentuniversity(studentuniversitywise);

        obj.sameCity(studentuniversitywise);

        obj.sameAge(studentuniversitywise);


    }
}

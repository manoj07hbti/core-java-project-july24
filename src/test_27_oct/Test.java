package test_27_oct;

import collection.StudentArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

    // Write a program to create Student(name,age,city,dept)HashMap
    //1. insert all data using Scanner with JNU,DU,AMU,AND display student who is having age greater
    //than 25 and belong to pune city for jnu and amu.

    //String Key:,ArrayList<Student>:value

    public ArrayList<Student> createStudentData() {


        System.out.println("How many Student you want to enter:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        ArrayList<Student> studentArrayList = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("pleas enter name:");
            String name = scanner1.nextLine();

            System.out.println("pleas enter age:");
            int age = scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);

            System.out.println("pleas enter city:");
            String city = scanner2.nextLine();

            System.out.println("pleas enter dept:");
            String dept = scanner2.nextLine();

            Student student = new Student(name, age, city, dept);

            studentArrayList.add(student);
        }
        return studentArrayList;
    }

    //2.
    public void FindHighestLowestAge( ArrayList<Student>studentArrayList) {

        int highestAge = 0;
        int lowestAge = 0;
        //finding highest



        for (Student student : studentArrayList) {
            if (highestAge < student.getAge()) {
                highestAge = student.getAge();
            }
        }
        System.out.println("WE HAVE FOUND STUDENT WITH HIGHEST AGE :" + highestAge);
        //finding lowest
        for (Student student : studentArrayList) {

            if (lowestAge > student.getAge()) {
                lowestAge = student.getAge();
            }
        }
        System.out.println("LOWEST AGE :" + lowestAge);

        }
        //3). display all the students data university wise
        public void universityWiseStudent (HashMap < String, ArrayList < Student >> studentUniversityWise){
            System.out.println("All the students data university wise..");

            for (String key : studentUniversityWise.keySet()) {

                System.out.println("Data of " + key + "university is :");



            }
        }

        //4.  display all student data together who is having same city in jnu and amu
        public void printSameCityStudent (HashMap < String, ArrayList < Student >> companyWiseData){
            for (String key : companyWiseData.keySet()) {

                for (Student student : companyWiseData.get(key)) {
                    System.out.println("COMPANY NAME: " + key);

                    System.out.println("Name: " + student.getName() + " age: " + student.getAge() + "city: " + student.getCity() + " dept: " + student.getDept());
                }
            }
        }

        //5. display only student who is  having same age for all university in jnu and amu
        public void sameAgeStudent (HashMap < String, ArrayList < Student >> studentUniversityWise){

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

    public void main(String[] args) {



                Test obj = new Test();
                String choice = "y";

                HashMap<String, ArrayList<Student>> companyWiseData = new HashMap<>();
                while (choice.equals("y")) {
                    System.out.println("pleas enter company name for witch you want to create data");

                    Scanner scanner = new Scanner(System.in);
                    String companyName = scanner.nextLine();
                    ArrayList<Student> studentArrayList = obj.createStudentData();


                    companyWiseData.put(companyName, studentArrayList);

                    for (String key : companyWiseData.keySet()) {

                        for (Student student : companyWiseData.get(key)) {
                            System.out.println("COMPANY NAME: " + key);
                            System.out.println("Name: " + student.getName() + " age: " + student.getAge() + "city: " + student.getCity() + " dept: " + student.getDept());
                        }
                    }
                    System.out.println("DO YOU WANT TO ADD ONE MORE COMPANY DATA? PRESS Y TO CONTINUE OR ANY OTHER TO EXIT ");

                    Scanner scanner1 = new Scanner(System.in);
                    choice = scanner1.nextLine();


                }
                //2.
                obj.FindHighestLowestAge(companyWiseData.get("du"));
                //3.
                obj.universityWiseStudent(companyWiseData);
                //4.
                 obj.printSameCityStudent(companyWiseData);
                 //5.
                  obj.sameAgeStudent(companyWiseData);
            }

        }


package test_27_october;

import model.StudentModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {

    //Insert all the data using scanner with JNU,DU,AMU.

    public ArrayList<StudentModel> createStudentData() {

        System.out.println("how many student you want to enter ?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<StudentModel> studentModelArrayList = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            System.out.println("please enter the details of student:" + (i + 1));
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("please enter name..");
            String name = scanner1.nextLine();

            System.out.println("please enter age..");
            int age = scanner1.nextInt();

            System.out.println("please enter city..");
            Scanner scanner2 = new Scanner(System.in);
            String city = scanner2.nextLine();

            System.out.println("please enter department..");
            Scanner scanner3 = new Scanner(System.in);
            String department = scanner3.nextLine();

            StudentModel studentModel = new StudentModel(name, age, city, department);
            studentModelArrayList.add(studentModel);

        }
        return studentModelArrayList;

    }

    //1).display student who is having age greater than 25 and belong to pune city for JNU and AMU

    public void displayStudent(HashMap<String, ArrayList<StudentModel>> studentUniversityWise) {
        System.out.println("display student who is having age greater than 25 and belong to pune city for JNU and AMU");

        for (String key : studentUniversityWise.keySet()) {
            if (key.equals("JNU") || key.equals("AMU")) {
            ArrayList<StudentModel> studentModelArrayList = studentUniversityWise.get(key);

                for (StudentModel std : studentModelArrayList) {
                    if (std.getAge() <= 25 && std.getCity().equals("PUNE")) {
                        System.out.println("COMPANY NAME :" + key + "NAME:" + std.getName() + " " + "AGE:" + std.getAge() + " " + "CITY:" + std.getCity() + " " + "DEPARTMENT:" + std.getDepartment());
                    }
                }
            }

        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>...");
    }

    //2).write highest age and lowest age student in JNU and AMU

    public void highestLowestAge(HashMap<String, ArrayList<StudentModel>> studentUniversityWise) {
        System.out.println("DISPLAY HIGHEST AND LOWEST AGE .....");

        int highestAgeStudent = 0;
        int lowestAgeStudent = 0;
        for (String key : studentUniversityWise.keySet()) {
            ArrayList<StudentModel> studentModelArrayList = studentUniversityWise.get(key);
            if (key.equals("JNU") || key.equals("AMU")) {

                for (StudentModel std : studentModelArrayList) {
                    if (highestAgeStudent < std.getAge()) {
                        highestAgeStudent = std.getAge();
                    }
                    System.out.println("STUDENT OF HIGHEST AGE:" + highestAgeStudent);
                    System.out.println("NAME" + std.getName() + " age:" + std.getAge() + "city:" + std.getCity() + "DEP:" + std.getDepartment());

                    if (lowestAgeStudent > std.getAge()) {
                        lowestAgeStudent = std.getAge();
                    }
                    System.out.println("STUDENT OF LOWEST AGE :" + lowestAgeStudent);

                    System.out.println("NAME" + std.getName() + " age:" + std.getAge() + "city:" + std.getCity() + "DEP:" + std.getDepartment());
                }
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>........");

    }

    //3). display all the students data universitywise

    public void universityWiseStudent(HashMap<String, ArrayList<StudentModel>> studentUniversityWise){

        System.out.println("All the students data university wise..");

        for(String key : studentUniversityWise.keySet()){
            System.out.println("Data of "+ key +"university is :");

            ArrayList<StudentModel> studentModelArrayList= studentUniversityWise.get(key);
            for(StudentModel std : studentModelArrayList){
                System.out.println("NAME:"+ std.getName()+" "+ std.getAge()+" "+ std.getCity()+" "+ std.getDepartment());

            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }


    //4).display all the student data together who is having same city in JNU and AMU

    public void sameCityStudent(HashMap<String, ArrayList<StudentModel>> studentUniversityWise) {

        System.out.println("Which company do you want to compare..");
        Scanner scanner = new Scanner(System.in);
        String university1 = scanner.nextLine();

        System.out.println("enter another company that you want to compare..");
        Scanner scanner1 = new Scanner(System.in);
        String university2 = scanner1.nextLine();

        ArrayList<StudentModel> university1Student = studentUniversityWise.get(university1);
        ArrayList<StudentModel> university2Student = studentUniversityWise.get(university2);

        for (StudentModel US1 : university1Student) {
            for (StudentModel US2 : university2Student) {
                if (US1.getCity().equals(US2.getCity())) {
                    System.out.println("UNIVERSITY1 : NAME :" + US1.getName() + " " + "AGE:" + US1.getAge() + " " + "CITY:" + US1.getCity() + " " + "DEPARTMENT:" + US1.getDepartment());
                    System.out.println("UNIVERSITY2 : NAME :" + US2.getName() + " " + "AGE:" + US2.getAge() + " " + "CITY:" + US2.getCity() + " " + "DEPARTMENT:" + US2.getDepartment());
                }
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
    }

    //5). display same age students in JNU nad AMU

    public void sameAgeStudent(HashMap<String, ArrayList<StudentModel>> studentUniversityWise){
        System.out.println("Same age students in JNU and AMU ..");

        ArrayList<StudentModel> jnuStudent = studentUniversityWise.get("JNU");
        ArrayList<StudentModel> amuStudent = studentUniversityWise.get("AMU");

        for(StudentModel US1 : jnuStudent ){
            for(StudentModel US2 : amuStudent){
              if(US1.getAge() == US2.getAge()) {
                  System.out.println(" JNU UNIVERSITY : NAME :" + US1.getName() + " " + "AGE:" + US1.getAge() + " " + "CITY:" + US1.getCity() + " " + "DEPARTMENT:" + US1.getDepartment());
                  System.out.println(" AMU UNIVERSITY : NAME :" + US2.getName() + " " + "AGE:" + US2.getAge() + " " + "CITY:" + US2.getCity() + " " + "DEPARTMENT:" + US2.getDepartment());

              }
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
    }


    public static void main(String[] args) {
        Student obj = new Student();
        String choice = "Y";
        HashMap<String, ArrayList<StudentModel>> studentUniversityWise = new HashMap<>();
        while (choice.equals("Y")) {
            System.out.println("please enter university Name, in which data of student that you want to create..");
            Scanner scanner = new Scanner(System.in);
            String universityName = scanner.nextLine();
            ArrayList<StudentModel> studentModelArrayList = obj.createStudentData();


            studentUniversityWise.put(universityName, studentModelArrayList);

            for(String key:studentUniversityWise.keySet()){
                for(StudentModel std : studentUniversityWise.get(key)){
                    System.out.println("UNIVERSITY NAME:"+ key);
                    System.out.println("NAME:"+ std.getName()+" "+ std.getAge()+" "+ std.getCity()+" "+ std.getDepartment());
                }
            }

            System.out.println("do you want to add one more university ,press Y ; if not , press any other alphabet");
            Scanner scanner5= new Scanner(System.in);
            choice = scanner5.nextLine();
        }

        //1. display student age greater than 25 and belongs to pune for JNU and AMU
        obj.displayStudent(studentUniversityWise);

        //2. find highest and lowest age for JNU And AMU university
       obj.highestLowestAge(studentUniversityWise);

       //3. universitywise students data
       obj.universityWiseStudent(studentUniversityWise);

       //4. same city students for JNU And AMU university
        obj.sameCityStudent(studentUniversityWise);

        //5. only students having same age for JNU And AMU university
        obj.sameAgeStudent(studentUniversityWise);
    }
}
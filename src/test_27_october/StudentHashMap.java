package test_27_october;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {

    //create hashmap
    public ArrayList<Student> createStudentArrayList(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Student you want to add");
        int num = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> studentArrayList = new ArrayList<>();
        for(int i=0; i<num; i++){
            System.out.println("Enter the details of Student "+(i+1));

            System.out.println("Enter Student Name");
            String name = sc.nextLine();
            System.out.println("Enter Student salary");
            int age= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student City");
            String city = sc.nextLine();
            System.out.println("Enter Student Department");
            String dept = sc.nextLine();

            Student tempStudent = new Student(name,age,city,dept);

            studentArrayList.add(tempStudent);

        }

        System.out.println("\n\n\n");

        return studentArrayList;

    }

    //1: display student who is having age greater than 25 and belongs to Pune city for JNU and AMU.
    public void diplayStudent(HashMap<String, ArrayList<Student>> studentHashMap){

        System.out.println("-----------student who is having age greater than 25 and belongs to Pune city for JNU and AMU-------");

        for(String key : studentHashMap.keySet()){

            if(key.equals("JNU") || key.equals("AMU")){
                ArrayList<Student> employees = studentHashMap.get(key);

                for(Student student : employees){
                    if(student.getAge()> 25 && student.getCity().equals("PUNE")){
                        System.out.println("University Name: "+key + "  Name: "+student.getName()+ " Age: "+student.getAge() +" City: "+student.getCity() +" Dept: " +student.getDept()) ;
                    }
                }
            }
        }

        System.out.println("\n\n\n");
    }

    //2: find highest age student and lowest age student
    public void findStudent(HashMap<String, ArrayList<Student>> studentHashMap){

        Student highestAgeStudent = null;
        Student lowestAgeStudent = null;
        for(String key : studentHashMap.keySet()){

            ArrayList<Student> students = studentHashMap.get(key);

            for(Student student : students){
                if(highestAgeStudent == null || student.getAge() > highestAgeStudent.getAge()){
                    highestAgeStudent = student;
                }

                if(lowestAgeStudent == null || student.getAge() < lowestAgeStudent.getAge()){
                    lowestAgeStudent = student;
                }
            }
        }

        System.out.println("Student with the Highest Salary: ");
        System.out.println("Name: " + highestAgeStudent.getName() +
                " Salary: " + highestAgeStudent.getAge() +
                " City: " + highestAgeStudent.getCity() +
                " Dept: " + highestAgeStudent.getDept());

        System.out.println("Student with the Lowest Salary: ");
        System.out.println("Name: " + lowestAgeStudent.getName() +
                " Salary: " + lowestAgeStudent.getAge() +
                " City: " + lowestAgeStudent.getCity() +
                " Dept: " + lowestAgeStudent.getDept());

        System.out.println("\n\n\n");
    }

    //3:  display all students data university wise
    public void displayData(HashMap<String, ArrayList<Student>> studnetHashMap){

        System.out.println("--------all students data university wise-------------");

        for(String key : studnetHashMap.keySet()){
            System.out.println("Data of "+key +" University is :");

            ArrayList<Student> students =  studnetHashMap.get(key);
            for(Student student : students){
                System.out.println("Name: "+student.getName()+ " Age: "+student.getAge() +" City: "+student.getCity() +" Dept: " +student.getDept()) ;
            }
        }

        System.out.println("\n\n\n");
    }


    //4: display all student data together who is having same city in JNU and AMU .
    public void displaySameCityStudent(HashMap<String, ArrayList<Student>> empHashMap){

        System.out.println("--------all student data together who is having same city in JNU and AMU-------------");
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> jnuStudents = empHashMap.get("JNU");
        ArrayList<Student> amuStudents = empHashMap.get("AMU");


        for(Student jnuStudent : jnuStudents){
            for(Student amuStudent : amuStudents){
                if(jnuStudent.getCity().equals(amuStudent.getCity())){
                    System.out.println("Name: "+jnuStudent.getName()+ " Age: "+jnuStudent.getAge() +" City: "+jnuStudent.getCity() +" Dept: " +jnuStudent.getDept()) ;
                    System.out.println("Name: "+amuStudent.getName()+ " Age: "+amuStudent.getAge() +" City: "+amuStudent.getCity() +" Dept: " +amuStudent.getDept()) ;
                }
            }
        }

        System.out.println("\n\n\n");
    }


    //5: display same age Student in JNU and AMU
    public void displaySameAgeStudent(HashMap<String, ArrayList<Student>> studentHashMap){

        System.out.println("--------all same age Student in JNU and AMU-------------");
        Scanner sc = new Scanner(System.in);


        ArrayList<Student> jnuStudents = studentHashMap.get("JNU");
        ArrayList<Student> amuStudents = studentHashMap.get("AMU");

        for(Student jnuStudent : jnuStudents){
            for(Student amuStudent : amuStudents){

                if(jnuStudent.getAge() == amuStudent.getAge()){
                    System.out.println("Name: "+jnuStudent.getName()+ " Age: "+jnuStudent.getAge() +" City: "+jnuStudent.getCity() +" Dept: " +jnuStudent.getDept()) ;
                    System.out.println("Name: "+amuStudent.getName()+ " Age: "+amuStudent.getAge() +" City: "+amuStudent.getCity() +" Dept: " +amuStudent.getDept()) ;
                }

            }

        }

        System.out.println("\n\n\n");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentHashMap obj = new StudentHashMap();
        HashMap<String,ArrayList<Student>> studentHashMap = new HashMap<>();

        String choice = "Y";

        while(choice.equals("Y")){

            System.out.println("Please Enter the University to Enter Student data");
            String universityName = sc.nextLine();
            ArrayList<Student> studentArrayList = obj.createStudentArrayList();

            studentHashMap.put(universityName, studentArrayList);

            for(String key : studentHashMap.keySet()){

                for (Student student : studentHashMap.get(key)){
                    System.out.println("University Name: "+key + "  Name: "+student.getName()+ " Age: "+student.getAge() +" City: "+student.getCity() +" Dept: " +student.getDept()) ;
                }

            }

            System.out.println("Do you want to add more University data? Press Y to continue or any other key to exit");
            choice = sc.nextLine();
        }

        //1
        obj.diplayStudent(studentHashMap);
        //2
        obj.findStudent(studentHashMap);
        //3
        obj.displayData(studentHashMap);
        //4
        obj.displaySameCityStudent(studentHashMap);
        //5
        obj.displaySameAgeStudent(studentHashMap);

    }

}

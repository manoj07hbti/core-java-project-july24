package collection.list;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public ArrayList <Student> createStudentList(){
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <Student> studentArrayList= new ArrayList<>(); // we have created student arraylist

        // data of students- create the data of student
   // TODO use scanner to assign the values
        Student student1= new Student("Raj",21,"CS");
        Student student2= new Student("Rohit",22,"IT");
        Student student3= new Student("jatin",21,"IT");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);


        return studentArrayList;
    }

    public static void main(String[] args) {
        StudentArrayList obj= new StudentArrayList();
        ;


        for(Student var: obj.createStudentList()){

            System.out.println("Printing in loop "+var.getName() + " Age: "+var.getAge() +" Section: "+var.getSection());
        }
    }
}

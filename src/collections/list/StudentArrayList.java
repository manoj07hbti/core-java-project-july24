package collections.list;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public void createStudentList() {
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Student> studentArrayList = new ArrayList<>();
        // we create data of student
        Student student1 = new Student("himanshu", 21, "A");
        Student student2 = new Student("rohit", 22, "B");
        Student student3 = new Student("krishna", 24, "C");
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        System.out.println("printing all data" + studentArrayList);

        for (Student var : studentArrayList) {
            System.out.println("printing with loop:" + var.getName() + " Age: " + var.getAge() + " Section: " + var.getSection());
        }


    }

    public static void main(String[] args) {
        StudentArrayList obj = new StudentArrayList();
        obj.createStudentList();
    }
}

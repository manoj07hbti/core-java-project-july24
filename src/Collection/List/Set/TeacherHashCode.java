package Collection.List.Set;

import Model.Teacher;

import java.util.HashSet;

public class TeacherHashCode {

    public static void main(String[] args) {

        HashSet<Teacher> teachers = new HashSet<>();

        Teacher teacher1 = new Teacher("zuhan", 20, "civil");
        System.out.println("Hashcode of teacher1...." + teacher1.hashCode());

        Teacher teacher2 = new Teacher("zuhan", 20, "civil");
        System.out.println("Hashcode of teacher2...." + teacher2.hashCode());

        Teacher teacher3 = new Teacher("imran", 22, "CS");
        System.out.println("Hashcode of teacher3...." + teacher3.hashCode());

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        for (Teacher var : teachers) {

            System.out.println(" Name " + var.getName() + " Age " + var.getAge() + " Section " + var.getSection());

        }

    }
}

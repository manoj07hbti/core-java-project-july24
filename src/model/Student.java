package model;

public class Student {

    public static Object add;
    String name;
    int age;
    String section;

    // parametrized constructor
    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;


    }

    public static void add(Student student1) {

    }
        // getter setter


        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public int getAge () {
            return age;
        }
        public void setAge ( int age){
            this.age = age;
        }
        public String getSection () {
            return section;
        }
        public void setSection (String section){
            this.section = section;
        }
    }



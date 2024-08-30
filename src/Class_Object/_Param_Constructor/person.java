package Class_Object._Param_Constructor;

public class person {

    String name;
    int age;
    String education;


    //


    public person(String name, int age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;

    }

    public static void main(String[] args) {

        // className objName = new className (value1, value2, value3.....valueN);

        person person1= new person("Rashmi",27, "BSC" );

        System.out.println("  PERSON1: NAME "+person1.name+" AGE: "+ person1.age+" EDUCATION: "+person1.education );

        person person2= new person("RAJ", 44, "MA");

        System.out.println("person2: name " +person2.name+ "person2: age " +person2.age+ "person2: education: "+person2.education);

    }

}

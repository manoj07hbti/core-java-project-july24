package Parma_constructor;

public class Docter {

    String name;
    int experience;
    String dept;
    String education;

    public Docter(String name, int experience, String dept, String education) {

        this.name = name;
        this.experience = experience;
        this.dept = dept;
        this.education = education;
    }

    public static void main(String[] args) {

        // Classname objname = new classname(value1,value2,value3.......valueN);

        Docter obj1 = new Docter("m.l.gupta", 20, "derma", "m.d");

        System.out.println("docter name printing" + obj1.name + "exp" + obj1.experience + "dept" + obj1.dept + "education" + obj1.education);

        Docter obj2 = new Docter("prabhdeep singh", 02, "madicine", "m.d");

        System.out.println("docter name" + obj2.name + "exp" + obj2.experience + "dept" + obj2.dept + "edu" + obj2.education);

        Docter obj3 = new Docter("Ramsha.Aziz", 02, "derma", "m.d");

        System.out.println("docter name" + obj3.name + "exp" + obj3.experience + "dept" + obj3.dept + "edu" + obj3.education);


    }


}

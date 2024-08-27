package Class_and_Object;

public class Collage {


    String name = "AGRA COLLEGE";
    String university = "Dr.BRAU.AGRA";
    String course = "BTECH";
    String branch = "civil";

    public static void main(String[] args) {


        // Classname objname = new classname();//default  constructor


        Collage obj1 = new Collage();

        System.out.println("name" + obj1.name + "university" + obj1.university + "course" + obj1.course + "branch" + obj1.branch);

        Collage obj2 = new Collage();

        System.out.println("name" + obj2.name + "university" + obj2.university + "course" + obj2.course + "branch" + obj2.branch);

        Collage obj3 = new Collage();

        System.out.println("name" + obj3.name + "university" + obj3.university + "course" + obj3.course + "branch" + obj3.branch);

        Collage obj4 = new Collage();

        System.out.println("name" + obj4.name + "university" + obj4.university + "course" + obj4.course + "branch" + obj4.branch);

        Collage obj5 = new Collage();

        System.out.println("name" + obj5.name + "university" + obj5.university + "course" + obj5.course + "branch" + obj5.branch);

    }

}

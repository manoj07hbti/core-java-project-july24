package Parma_constructor;

public class Collage {

    String name;

    String collage;

    String course;

    String branch;

    //Parameterized constructor


    public Collage(String name, String collage, String course, String branch) {

        this.name = name;
        this.collage = collage;
        this.course = course;
        this.branch = branch;

    }

        public static void main(String[] args) {

        // Classname objname = new classname(value1,value2,value3.......valueN);

        Collage obj1 = new Collage("rahul", "F.H.HOSPITAL", "M.D", "M.B.B.S");

        System.out.println("Collage printing" + obj1.name + "Collage" + obj1.collage + "Course" + obj1.course + "Branch" + obj1.branch);

            Collage obj2 = new Collage("imran", "agra collage", "Btech", "civil");

            System.out.println("printing"+obj2.name + "agra" +obj2.collage + "course" +obj2.course +"branch" +obj2.branch);

            Collage obj3 = new Collage("zuhan", "F.H.HOSPITAL", "GNM", "Nurshing");

            System.out.println("name"+obj3.name +"collage" +obj3.collage +"course" +obj3.course +"branch" +obj3.branch);

            Collage obj4 = new Collage("Rohan", "DPS", "b.sc", "Science");

            System.out.println("collage"+obj4.collage +"name" +obj4.name +"course" +obj4.course +"branch"+obj4.branch);

            Collage obj5 = new Collage("Khan", "delhi uni", "cs", "btech");

            System.out.println("name"+obj5.name +"collage" +obj5.collage +"course"+obj5.course +"branch"+obj5.branch);
            

        }
}

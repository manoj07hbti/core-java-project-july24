package class_and_object;

public class DocterClass {

    String name=" Dr.ABHIKA";
    int experience =10;
    String post="Surgeon";
    String education ="MBBS";
    int salary = 10;

    public static void main(String[] args) {

        //default constructor

        DocterClass dr1 =new DocterClass();
        System.out.println("name:"+dr1.name);
        System.out.println("experience:"+dr1.experience+"years");
        System.out.println("post:"+dr1.post);
        System.out.println("education:"+dr1.education);
        System.out.println("salary:"+dr1.salary+" lakh per month");

    }


}

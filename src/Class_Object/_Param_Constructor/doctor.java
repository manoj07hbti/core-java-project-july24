package Class_Object._Param_Constructor;

public class doctor {
    String name;
    int age;
    String degree;


    public doctor(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public static void main(String[] args) {

        // className objName= new className(value1,value2,value3.......)

        doctor doctor1=new doctor("rahul",22,"mbbs");

        System.out.println("doctor 1: NAME "+doctor1.name+" doctor1: age " +doctor1.age+" doctor1: degree "+doctor1 . degree);
        doctor doctor2=new doctor("mohit",23,"mbbs");

        System.out.println("docter2: NAME "+doctor2.name+ "docter2: age "+doctor2.age+ "docter2: degree "+doctor2 . degree);



    }

}







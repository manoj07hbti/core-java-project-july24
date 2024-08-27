package class_and_object;

public class EngiClassParaConstructor {

    String name;
    int age;
    String department;

    //parameterised constructor


    public EngiClassParaConstructor(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {
        EngiClassParaConstructor e1 =new EngiClassParaConstructor("DEEKSHA",27,"CIVIL ENGINEER");
        EngiClassParaConstructor e2= new EngiClassParaConstructor("RASHMI",26,"MECHANICAL");
        EngiClassParaConstructor e3=new EngiClassParaConstructor("KIRTI",29,"ELECTRONICS");
        EngiClassParaConstructor e4=new EngiClassParaConstructor("HEENA",25,"ELECTRICAL");
        EngiClassParaConstructor e5=new EngiClassParaConstructor("CV",24,"CS");

        System.out.println("ENGINEER 1..>"+ "NAME:"+ e1.name + " , " +"AGE:"+ e1.age + " , " + "DEPARTMENT:"+ e1.department);
        System.out.println("ENGINEER 2..>"+ "NAME:"+ e2.name + " , " +"AGE:"+ e2.age + " , " + "DEPARTMENT:"+ e2.department);
        System.out.println("ENGINEER 3..>"+ "NAME:"+ e3.name + " , " +"AGE:"+ e3.age + " , " + "DEPARTMENT:"+ e3.department);
        System.out.println("ENGINEER 4..>"+ "NAME:"+ e4.name + " , " +"AGE:"+ e4.age + " , " + "DEPARTMENT:"+ e4.department);
        System.out.println("ENGINEER 5..>"+ "NAME:"+ e5.name + " , " +"AGE:"+ e5.age + " , " + "DEPARTMENT:"+ e5.department);


    }





}

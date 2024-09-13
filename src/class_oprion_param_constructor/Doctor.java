package class_oprion_param_constructor;

public class Doctor {
    String name;
    int age;
    String department;

    public Doctor(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {
        Doctor doc=new Doctor("Ruhi",27,"OPD");
        System.out.println("Name: "+doc.name+" , Age: "+doc.age+" , Department: "+doc.department);
    }
}

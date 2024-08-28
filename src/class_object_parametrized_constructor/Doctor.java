package class_object_parametrized_constructor;

public class Doctor {

    String name;
    int age;
    String speciality;
    String designation;

    // parametrized constructor

    public Doctor(String name, int age, String speciality, String designation) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.designation = designation;
    }

    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Dr.Madhusudan lal", 50, "Urology", "Agra");
        Doctor doc2 = new Doctor(" Dr.Rajan lal", 45, "Skin Specialist ", "Delhi");
        Doctor doc3 = new Doctor("Dr. krishna Gokhale", 49, "Gynecologist", "Pune");
        System.out.println("Name " + doc1.name + "Age " + doc1.age + "Speciality " + doc1.speciality + "Designation " + doc1.designation);
        System.out.println("Name " + doc2.name + "Age " + doc2.age + "Speciality " + doc2.speciality + "Designation " + doc2.designation);
        System.out.println("Name " + doc3.name + "Age " + doc3.age + "Speciality " + doc3.speciality + "Designation " + doc3.designation);


    }
}

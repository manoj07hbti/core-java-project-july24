package collections.set;

import methods.Doctor;
import model.Student;

import java.util.HashSet;

public class DoctorHashSet {

    public static void main(String[] args) {

        HashSet <model.Doctor> doctors=new HashSet<>();

        HashSet<Doctor> doctor= new HashSet<>();
        model.Doctor doctor1= new model.Doctor("agrawal:",33,"surgery",50000);
        System.out.println("hashcode of doctor1"+doctor1.hashCode());
        model.Doctor doctor2= new model.Doctor("Mehta:",36,"heart",1000000);
        System.out.println("hashcode of doctor2"+doctor2.hashCode());
        model.Doctor doctor3= new model.Doctor("agrawal:",33,"surgery",50000);
        System.out.println("hashcode of doctor3"+doctor3.hashCode());

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);

        for (model.Doctor var:doctors){
            System.out.println("Name  "+var.getName() + "  Age  "+var.getAge() + " Department  " + var.getDept() + "  KSalary  " + var.getSalary());
        }
    }
}

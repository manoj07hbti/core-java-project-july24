package collections.Linked;

import model.Doctor;

import java.util.LinkedHashSet;

public class DoctorLinkedSet {
    public static void main(String[] args) {


        LinkedHashSet<Doctor> doctors = new LinkedHashSet<>();

        Doctor doctor1 = new Doctor("MAdhusudanlal", 45, "UROLOGIST", "MBBS");
        System.out.println("HASHCODE of doctor1.." + doctor1.hashCode());

        Doctor doctor2 = new Doctor("PANKAJ", 50, "GYNOLOGIST", "MBBS");
        System.out.println("HAshcode of doctor2..." + doctor2.hashCode());

        Doctor doctor3 = new Doctor("PANKAJ", 50, "GYNOLOGIST", "MBBS");
        System.out.println("HashCode of Doctor3..." + doctor3.hashCode());

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);


        for (Doctor var : doctors) {
            System.out.println(" Name " + var.getName() + " Age " + var.getAge() + " Speciality " + var.getSpeciality() + " Degree " + var.getDegree());
        }

    }


}

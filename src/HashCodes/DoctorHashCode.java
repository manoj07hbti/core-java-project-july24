package HashCodes;

import Model.Doctor;

import java.util.HashSet;

public class DoctorHashCode
{
    public static void main(String[] args)
    {
        HashSet<Doctor> doctors = new HashSet<>();

        Doctor doctor1 = new Doctor("Robert",56, "Neurosurgeon");
        System.out.println("Hashcode of doctor1: "+ doctor1.hashCode());

        Doctor doctor2 = new Doctor("Robert",56, "Neurosurgeon");
        System.out.println("Hashcode of doctor2: "+ doctor2.hashCode());

        Doctor doctor3 = new Doctor("Sam",45, "Dentist");
        System.out.println("Hashcode of doctor3: "+ doctor3.hashCode());

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);

        for (Doctor var: doctors)
        {
            System.out.println
                    (
                    "Name: "+var.getName()+
                    ", Age: "+var.getAge()+
                    ", Field: "+var.getField()
                    );
        }
    }
}

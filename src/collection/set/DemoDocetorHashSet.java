package collection.set;

import model.Docetor;


import java.util.HashSet;

public class DemoDocetorHashSet {

    public static void main(String[] args) {



    HashSet<Docetor> doctor = new HashSet<>();

    Docetor doctor1 = new Docetor("Rashmi", 31, "TUNDLA", "IT");

        System.out.println("HAshocde of docetor1...." + doctor1.hashCode());


    Docetor doctor2= new Docetor("RASHMI", 31, "TUNDLA", "IT");
        System.out.println("Hashcode of docetor2..." + doctor2.hashCode());


    Docetor docetor3 = new Docetor("ADEEBA", 25, "TUNDLA", "MBBS");
        System.out.println("Hashcode os doctor3..." +docetor3.hashCode());


    Docetor docetor4 = new Docetor("ADEEBA", 26, "TUNDLA", "MBBS");
        System.out.println("Hashcode of docetor4 " + docetor4.hashCode());


        doctor.add(doctor1);
        doctor.add(doctor2);
        doctor.add(docetor3);
        doctor.add(docetor4);

        for (Docetor var : doctor) {

        System.out.println(" Name. " + var.getName() + "  Age " + var.getAge() + " SPECIALITY " + var.getSpeciality() + " DEGREE " + var.getDegree());
    }


    }
}


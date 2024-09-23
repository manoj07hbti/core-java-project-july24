package collections;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorArrayList {

    public ArrayList<Doctor> createDoctorList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Doctor> doctorArrayList = new ArrayList<>();
        System.out.println("Please enter number of doctors ");
        int numberOfDoctors = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfDoctors; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter details of doctors...");
            System.out.print("Name..");
            String name = scanner1.nextLine();

            System.out.println("Age..");
            int age = scanner.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Speciality..");

            String speciality = scanner2.nextLine();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Degreee..");
            String degree = scanner3.nextLine();

            Doctor doctor = new Doctor(name, age, speciality, degree);

            doctorArrayList.add(doctor);


        }
        return doctorArrayList;
    }


    public static void main(String[] args) {
        DoctorArrayList obj = new DoctorArrayList();

        ArrayList<Doctor> doctorArrayList = new ArrayList<>();

        for (Doctor var : obj.createDoctorList()) {
            System.out.println("Printing using loops.." + var.getName() + "Age " + var.getAge() + "Speciality " + var.getSpeciality() + "Degree " + var.getDegree());
        }

        System.out.println("Printing using while loop..");

        int i = 0;
        while (i < doctorArrayList.size()) {
            System.out.println("Printing name.." + doctorArrayList.get(i).getName() + " Age " + doctorArrayList.get(i).getAge() + "Speciality " + doctorArrayList.get(i).getSpeciality() + "Degree " + doctorArrayList.get(i).getDegree());
            i++;
        }

        System.out.println("Printing using do while loop..");
        do {
            System.out.println("Printing name." + doctorArrayList.get(i).getName() + "Age " + doctorArrayList.get(i).getAge() + "Speciality " + doctorArrayList.get(i).getSpeciality() + "Degree " + doctorArrayList.get(i).getDegree());
            i++;
        } while (i < doctorArrayList.size());
    }

}

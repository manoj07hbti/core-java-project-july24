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
            System.out.println("Enter details of doctors...");
            System.out.print("Name..");
            String name = scanner.nextLine();

            System.out.println("Age..");
            int age = scanner.nextInt();

            System.out.println("Speciality..");
            String speciality = scanner.nextLine();

            System.out.println("Degreee..");
            String degree = scanner.nextLine();
        }
        return doctorArrayList;
    }


    public static void main(String[] args) {
        DoctorArrayList obj = new DoctorArrayList();

        for (Doctor var : obj.createDoctorList()) {
            System.out.println("Printing using loops.." + var.getName() + "Age " + var.getAge() + "Speciality " + var.getSpeciality() + "Degree " + var.getDegree());
        }
    }

}

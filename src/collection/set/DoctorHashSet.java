package collection.set;

import model.Doctor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DoctorHashSet {
    public LinkedHashSet<Doctor> createDoctorList(){
        LinkedHashSet<Doctor>doctors=new LinkedHashSet<>();
        System.out.println("Please enter number of doctor's data to enter: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Please enter name of doctor: ");
            String name=scanner1.nextLine();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Please enter age of doctor: ");
            int age=scanner2.nextInt();
            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter section of doctor: ");
            String department=scanner3.nextLine();
            Doctor doctor=new Doctor(name,age,department);
            doctors.add(doctor);

        }return doctors;
    }

    public static void main(String[] args) {
        DoctorHashSet obj=new DoctorHashSet();
        for(Doctor var:obj.createDoctorList()){
            System.out.println("Printing Doctor Name: "+var.getName()+" Age: "+var.getAge()+" Department: "+var.getDepartment());
        }
    }
}

package collection;

import model.Doctor;
import model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorArrayList {
    public ArrayList<Doctor> createArrayList(){
        ArrayList<Doctor> doctorsArrayList=new ArrayList<>();
        System.out.println("Please enter number of doctors data to enter: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for (int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Please enter name: ");
            String name=scanner1.nextLine();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Please enter age:");
            int age=scanner2.nextInt();
            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter department: ");
            String department=scanner3.nextLine();
            Doctor doctor=new Doctor(name,age,department);
            doctorsArrayList.add(doctor);

        }return doctorsArrayList;
    }

    public static void main(String[] args) {
        DoctorArrayList obj=new DoctorArrayList();
        for(Doctor doctor:obj.createArrayList()){
            System.out.println("Doctor Name: "+doctor.getName()+" Age: "+doctor.getAge()+" Department: "+doctor.getDepartment());
        }
    }
}

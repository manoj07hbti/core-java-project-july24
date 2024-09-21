package collections.list;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class DoctorArrayList {

    public ArrayList<Doctor> createdoctorArrayList(){

        Scanner sc = new Scanner(System.in);

        ArrayList<Doctor> doctorsList = new ArrayList<>();

        System.out.println("Enter the number of doctors you want to add: ");
        int num= sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++){

            System.out.println("Enter Name for Doctor "+(i+1) +" : ");
            String name  = sc.nextLine();

            System.out.println("Enter dept for Doctor "+(i+1) +" : ");
            String dept = sc.nextLine();

            System.out.println("Enter id for Doctor "+(i+1) +" : ");
            int id = sc.nextInt();
            sc.nextLine();

            Doctor doctor = new Doctor(name,dept,id);

            doctorsList.add(doctor);

        }

        return doctorsList;
    }

    public static void main(String[] args) {
        DoctorArrayList obj = new DoctorArrayList();

        ArrayList<Doctor> doctorList = obj.createdoctorArrayList();

        System.out.println("Printing using for Loop");
        for(int i=0; i<doctorList.size(); i++){
            System.out.println("Name: "+doctorList.get(i).getName() + " EmployeeID: "+doctorList.get(i).getDept() + " Department: " +doctorList.get(i).getId() );
        }

        System.out.println("Printing using while Loop");
        int i=0;
        while(i<doctorList.size()){
            System.out.println("Name: "+doctorList.get(i).getName() + " EmployeeID: "+doctorList.get(i).getDept() + " Department: " +doctorList.get(i).getId() );
            i++;
        }

        System.out.println("Printing do-using while Loop");
        i=0;
        do{
            System.out.println("Name: "+doctorList.get(i).getName() + " EmployeeID: "+doctorList.get(i).getDept() + " Department: " +doctorList.get(i).getId() );
            i++;
        }while (i< doctorList.size());

    }


}

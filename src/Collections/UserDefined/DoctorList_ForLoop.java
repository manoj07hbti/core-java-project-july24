package Collections.UserDefined;

import Model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorList_ForLoop
{
    public ArrayList <Doctor> createDoctorList()
    {
        //Creating the arraylist
        ArrayList <Doctor> doctorArrayList = new ArrayList<>();

        System.out.println("Enter how many names you want to add:");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();

        for (int i= 0; i<size; i++)
        {
            Scanner scanner1= new Scanner(System.in);
            // Major details
            System.out.println("Enter name here:");
            String name= scanner1.nextLine();
            System.out.println("Enter age here:");
            int age= scanner1.nextInt();

            Scanner scanner2= new Scanner(System.in);
            System.out.println("Enter field here:");
            String field= scanner2.nextLine();

            Doctor doctor = new Doctor(name, age, field);
            doctorArrayList.add(doctor);
        }
        return doctorArrayList;
    }

    public static void main(String[] args)
    {
        DoctorList_ForLoop obj= new DoctorList_ForLoop();
        for (Doctor doctor : obj.createDoctorList())
        {
            System.out.println("Doctor's name: "+ doctor.getName()+
                    " Age: "+ doctor.getAge()+
                    " Field: "+ doctor.getField());
        }
    }
}

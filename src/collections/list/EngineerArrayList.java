package collections.list;

import model.Doctor;
import model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class EngineerArrayList {

    public ArrayList<Engineer> createEngineerArrayList(){

        Scanner sc = new Scanner(System.in);

        ArrayList<Engineer> enginnersList = new ArrayList<>();

        System.out.println("Enter the number of Engineers you want to add: ");
        int num= sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++){

            System.out.println("Enter Name for Engineer "+(i+1) +" : ");
            String name  = sc.nextLine();

            System.out.println("Enter branch of Enginner "+(i+1) +" : ");
            String branch = sc.nextLine();

            System.out.println("Enter year of Enginner "+(i+1) +" : ");
            int year = sc.nextInt();
            sc.nextLine();

            Engineer engineer = new Engineer(name,branch,year);

            enginnersList.add(engineer);

        }

        return enginnersList;
    }

    public static void main(String[] args) {
        EngineerArrayList obj = new EngineerArrayList();

        ArrayList<Engineer> engineersList = obj.createEngineerArrayList();


        System.out.println("Printing using for Loop");
        for(int i=0; i<engineersList.size(); i++){
            System.out.println("Name: "+engineersList.get(i).getName() + " Branch: "+engineersList.get(i).getBranch() + " Year: " +engineersList.get(i).getYear() );
        }

        System.out.println("Printing using while Loop");
        int i=0;
        while(i<engineersList.size()){
            System.out.println("Name: "+engineersList.get(i).getName() + " Branch: "+engineersList.get(i).getBranch() + " Year: " +engineersList.get(i).getYear() );
            i++;
        }

        System.out.println("Printing do-using while Loop");
         i=0;
       do {

           System.out.println("Name: " + engineersList.get(i).getName() + " Branch: " + engineersList.get(i).getBranch() + " Year: " + engineersList.get(i).getYear());
           i++;
       }while (i< engineersList.size());



    }


}

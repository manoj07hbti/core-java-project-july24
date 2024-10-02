package Collection.List.List;

import Model.EngineerList;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineerArrayList {

    public ArrayList<EngineerList> CreatEngineerList() {

        //collectionName <DataType> objName = new CollectionName<>();

        ArrayList<EngineerList> engineerArrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many names do you want to add?");

        int EngineerNumberList = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < EngineerNumberList; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println(" Name:");
            String Name = scanner1.nextLine();

            System.out.println(" Age:");
            int Age = scanner1.nextInt();

            System.out.println("Section:");
            String Section = scanner1.nextLine();

           EngineerList engineer = new EngineerList(Name, Age, Section);

            engineerArrayList.add(engineer);

        }

        return engineerArrayList;
    }

    public static void main(String[] args) {

       EngineerArrayList obj = new EngineerArrayList();

        ArrayList<EngineerList> engineerArrayList = new ArrayList<>();

        for (EngineerList var :  obj.CreatEngineerList()) {

            System.out.println(" Printing name... " +var.getName() + " Age... " + var.getAge() + " Section... " + var.getSection());

            System.out.println("Printing using while loop..");

        }
           int i = 0;

            while (i < engineerArrayList.size()) {

                System.out.println("Printing name.." + engineerArrayList.get(i).getName() + "Age " + engineerArrayList.get(i).getAge() +

                        "Section " +engineerArrayList.get(i).getSection());

                i++;
            }




    }

  
}


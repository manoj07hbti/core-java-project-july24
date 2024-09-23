package collection;

import model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineerArrayList {

    public ArrayList<Engineer> createEngineer(){
        ArrayList<Engineer> engineerArrayList= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many data of engineer ,that you want to enter? ");
        int size=scanner.nextInt();
        for(int i=0; i<size; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("PLEASE ENTER DATA OF ENGINEER"+(i+1) + ":");

            System.out.println("NAME:");
            String name=scanner1.nextLine();

            System.out.println("AGE");
            int age=scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("DEPARTMENT");
            String dep=scanner2.nextLine();

            Engineer engineer= new Engineer(name,age,dep);
            engineerArrayList.add(engineer);
        }
        return engineerArrayList;
    }

    public static void main(String[] args) {
      EngineerArrayList obj = new EngineerArrayList();
        ArrayList<Engineer> engineer= obj.createEngineer();

        System.out.println("USING FOR LOOP");
        for(int i=0; i<engineer.size(); i++){
            System.out.println("NAME:"+ engineer.get(i).getName() +" "+ "AGE:"+ engineer.get(i).getAge()+ " "+ "DEPARTMENT:"+ engineer.get(i).getDepartment());
        }

        System.out.println("USING WHILE LOOP");
        int i=0;
        while(i< engineer.size()){
            System.out.println("NAME:"+ engineer.get(i).getName() +" "+ "AGE:"+ engineer.get(i).getAge()+ " "+ "DEPARTMENT:"+ engineer.get(i).getDepartment());
            i++;
        }

        System.out.println("USING DO WHILE LOOP");
        i=0;
        do{
            System.out.println("NAME:"+ engineer.get(i).getName() +" "+ "AGE:"+ engineer.get(i).getAge()+ " "+ "DEPARTMENT:"+ engineer.get(i).getDepartment());
        i++;
        }while(i<engineer.size());
    }
}

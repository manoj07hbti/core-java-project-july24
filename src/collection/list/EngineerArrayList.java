package collection.list;

import model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineerArrayList {
    public ArrayList<Engineer> createArrayList(){
        ArrayList<Engineer> engineerArrayList=new ArrayList<>();
        System.out.println("Please enter number of employeed to enter: ");
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
           Engineer engineer=new Engineer(name,age,department);
           engineerArrayList.add(engineer);

        }return engineerArrayList;
    }

    public static void main(String[] args) {
        EngineerArrayList obj=new EngineerArrayList();
       for(Engineer engineer:obj.createArrayList()){
           System.out.println("Engineer Name: "+engineer.getName()+" Age: "+engineer.getAge()+" Department: "+engineer.getDepartment());
       }
    }
}

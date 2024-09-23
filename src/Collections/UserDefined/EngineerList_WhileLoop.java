package Collections.UserDefined;

import Model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineerList_WhileLoop
{
    public ArrayList <Engineer> createEngineerList()
    {
        // Creating the arraylist
        ArrayList<Engineer> engineerArrayList = new ArrayList<>();

        Scanner scanner= new Scanner(System.in);
        System.out.println("How many names do you want to add?");
        int size= scanner.nextInt();
        scanner.nextLine();

        for (int i= 0; i<size; i++)
        {
            //Major details
            System.out.println("Please enter name:");
            String name= scanner.nextLine();

            System.out.println("Please enter age:");
            int age= scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter field:");
            String field= scanner.nextLine();

            Engineer engineer= new Engineer(name, age, field);
            engineerArrayList.add(engineer);
        }
        return engineerArrayList;
    }

    public static void main(String[] args)
    {
        EngineerList_WhileLoop engineerList= new EngineerList_WhileLoop();
        ArrayList<Engineer> engineerArrayList= engineerList.createEngineerList();

        int i= 0;
        while (i<engineerArrayList.size())
        {
            Engineer engineer = engineerArrayList.get(i);
            System.out.println("Engineer's name: " +engineer.getName() +
                    " Age: " +engineer.getAge() +
                    " Field: " +engineer.getField());
            i++;
        }
    }
}

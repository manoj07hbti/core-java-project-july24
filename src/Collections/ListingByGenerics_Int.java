package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListingByGenerics_Int
{
    public ArrayList<Integer> creatingIntList()
    {
        ArrayList <Integer> numbers= new ArrayList<Integer>();
        System.out.println("Please enter a numerical value of printing numbers you want to add: ");

        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        for(int i=0; i<size; i++)
        {
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter the number:");
            numbers.add(scanner1.nextInt());
        }
        return numbers;
    }

    public static void main(String[] args)
    {
        ListingByGenerics_Int obj= new ListingByGenerics_Int();
        for (int var: obj.creatingIntList())
        {
            System.out.println("Added "+var+" in the list");
        }
    }
}

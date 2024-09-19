package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListingByGenerics_String
{
    public ArrayList<String> creatingStringList()
    {
        ArrayList<String> names= new ArrayList<>();
        System.out.println("Please enter a numerical value of adding names:");

        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        for (int i=0; i< size; i++)
        {
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter the name");
            names.add(scanner1.nextLine());
        }
        return names;
    }

    public static void main(String[] args)
    {
        ListingByGenerics_String obj= new ListingByGenerics_String();
        for (String var: obj.creatingStringList())
        {
            System.out.println("Adding "+var+" to the name list");
        }
    }
}

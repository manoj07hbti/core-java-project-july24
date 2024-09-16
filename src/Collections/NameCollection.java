package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class NameCollection
{
    public void PrintingNamesByLoops()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList InputNames = new ArrayList();

        System.out.println("Please enter 10 names...");
        for (int i= 0; i <= 10; i++)
        {
            String name = scanner.nextLine();
            InputNames.add(name);
        }

        // Printing names by using For Loop
        System.out.println("Printing names using for loop:");
        for (int i= 0; i < InputNames.size(); i++)
        {
            System.out.println("Printing Name- "+InputNames.get(i)+"at index: "+i);
        }

        // Printing names by using while loop
        System.out.println("Printing names using while loop:");
        int i= 0;
        while (i < InputNames.size())
        {
            System.out.println("Printing Name- "+InputNames.get(i)+"at index: "+i);
            i++;
        }

        // Printing names by using do while loop
        System.out.println("Printing names using do while loop:");
        i= 0;
        do
        {
            System.out.println("Printing Name- "+InputNames.get(i)+"at index: "+i);
            i++;
        }
        while (i < InputNames.size());

        // Printing names by using advance For Loop
        System.out.println("Printing using advanced for loop:");

        for (Object var : InputNames)
        {
            System.out.println("Printing name- "+var+"at index: "+i);
        }

    }
    public static void main (String[]args)
    {
        NameCollection obj = new NameCollection();
        obj.PrintingNamesByLoops();
    }
}

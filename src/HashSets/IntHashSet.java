package HashSets;

import java.util.HashSet;
import java.util.Scanner;

public class IntHashSet
{
    public HashSet<Integer> createIntHashSet()
    {
        HashSet<Integer> input= new HashSet<Integer>();
        System.out.println("Please enter a numerical value of adding Numbers:");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        for (int i= 0; i<size; i++)
        {
            Scanner scanner1= new Scanner(System.in);
            int valueAdded= scanner1.nextInt();
            input.add(valueAdded);
        }
        return input;
    }

    public static void main(String[] args)
    {
        IntHashSet obj= new IntHashSet();
        for (int var: obj.createIntHashSet())
        {
            System.out.println("Printing number: "+var);
        }
    }
}

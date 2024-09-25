package HashSets;

import java.util.HashSet;
import java.util.Scanner;

public class DoubleHashSet
{
    public HashSet<Double> createDoubleHastSet()
    {
        HashSet<Double> input= new HashSet<>();
        System.out.println("Please enter a number to add weights:");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        for (int i= 0; i<size; i++)
        {
            Scanner scanner1= new Scanner(System.in);
            Double addedWeight= scanner1.nextDouble();
            input.add(addedWeight);
        }
        return input;
    }

    public static void main(String[] args)
    {
        DoubleHashSet obj= new DoubleHashSet();
        for (Double var: obj.createDoubleHastSet())
        {
            System.out.println("Printing weight (in Kg): "+var);
        }
    }
}

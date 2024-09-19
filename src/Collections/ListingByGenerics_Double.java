package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListingByGenerics_Double
{
    public ArrayList<Double> creatingDoubleList()
    {
        ArrayList <Double> weight= new ArrayList<>();
        System.out.println("Please the numerical value of adding no. of weights in the list");

        Scanner scanner= new Scanner(System.in);
        Double size= scanner.nextDouble();
        for (int i=0; i< size; i++)
        {
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter the weight:");
            weight.add(scanner1.nextDouble());
        }
        return weight;
    }

    public static void main(String[] args)
    {
        ListingByGenerics_Double obj= new ListingByGenerics_Double();
        for(Double var: obj.creatingDoubleList())
        {
            System.out.println("Added "+var+"kg to the weight list");
        }
    }
}

package collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class DoubleHashSet {

    public HashSet<Double> createDoubleSet(){

        // HashSet<DataType> ObjectName= new HashSet<>(); :declare SYNTAX

        HashSet<Double> number= new HashSet<>();

        System.out.println("Please enter you want to number ");

        Scanner scanner= new Scanner(System.in);

        double size=scanner.nextInt();
        for (int i=0; i<size; i++){
            Scanner scanner1= new Scanner(System.in);
            Double num=scanner1.nextDouble();
            number.add(num);

        }
     return number;

    }

    public static void main(String[] args) {

        DoubleHashSet obj= new DoubleHashSet();

        for (Double var:obj.createDoubleSet()){
            System.out.println("Printing Double HashSet:"+ var);
        }

    }

}

package collection.set;

import java.util.HashSet;
import java.util.Scanner;

public class Double {
    public HashSet<java.lang.Double> createDouble(){
        HashSet<java.lang.Double>doubles=new HashSet<java.lang.Double>();
        System.out.println("Please amount of decimal numbers to enter: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            double numbers=scanner1.nextDouble();
            doubles.add(numbers);
        }return doubles;
    }

    public static void main(String[] args) {
        Double obj=new Double();
        for(double var:obj.createDouble()){
            System.out.println("Printing double numbers: "+var);
        }
    }
}

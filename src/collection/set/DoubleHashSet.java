package collection.set;

import java.util.HashSet;
import java.util.Scanner;

public class DoubleHashSet {

    public HashSet<Double> createDoubleSet() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Double> price = new HashSet<>();
        System.out.println("Please enter number of  price you want to enter.");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter price...");
            double myPrice = scanner.nextDouble();
            price.add(myPrice);
        }
        return price;
    }
    public static void main(String[] args) {
        DoubleHashSet obj = new DoubleHashSet();
        for (Double var : obj.createDoubleSet()) {
            System.out.println("Printing double hash set.." + var);
        }
    }
}




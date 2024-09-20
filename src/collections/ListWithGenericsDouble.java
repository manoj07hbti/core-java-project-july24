package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenericsDouble {

    public ArrayList<Double> createDoubleList() {
        ArrayList<Double> weight = new ArrayList<>();
        System.out.println("Please enter number of persons weight  you want to enter..");
        Scanner scanner = new Scanner(System.in);
        Double size = scanner.nextDouble();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter the weight");
            weight.add(scanner1.nextDouble());
        }
        return weight;
    }

    public static void main(String[] args) {
        ListWithGenericsDouble obj = new ListWithGenericsDouble();
        for (Double var : obj.createDoubleList()) {
            System.out.println("Printing number of weights of a person...." + var);
        }
    }

}

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenerics {


    public ArrayList<Double> createDoubleList() {

        ArrayList<Double> price = new ArrayList<>();

        System.out.println("please enter number price you want to enter..");
        Scanner scanner = new Scanner(System.in);
        double size = scanner.nextDouble();

        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("please enter price ..");
            price.add(scanner.nextDouble());


        }
        return price;

    }

    public static void main(String[] args) {

        ListWithGenerics obj = new ListWithGenerics();
        for(double var:obj.createDoubleList()){
            System.out.println("Printing number of price of a person...." + var);
        }

    }

}


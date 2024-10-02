package Collection.List.List;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenericsDouble {

    public ArrayList<Double> createDoubleList() {

        ArrayList<Double> Hight = new ArrayList<>();

        System.out.println("Please enter the hight of boys..");

        Scanner scanner = new Scanner(System.in);

        Double size = scanner.nextDouble();

        for (int i = 0; i < size; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("Please enter the hight");

            Hight.add(scanner1.nextDouble());
        }
        return Hight;
    }

    public static void main(String[] args) {

        ListWithGenericsDouble obj = new ListWithGenericsDouble();

        for (Double var : obj.createDoubleList()) {

            System.out.println("Printing  of Hight the boys...." + var);
        }
    }

}

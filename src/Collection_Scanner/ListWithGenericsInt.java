package Collection_Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenericsInt {

    public ArrayList<Integer> createIntegerList() {

        ArrayList<Integer> voterage = new ArrayList<>();

        System.out.println("please enter voter age...");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("enter voter age");

            voterage.add(scanner1.nextInt());
        }
        return voterage;
    }

    public static void main(String[] args) {

        ListWithGenericsInt obj = new ListWithGenericsInt();

        for (Integer var : obj.createIntegerList()) {

            System.out.println("Printing the voter age " + var);
        }
    }

}

package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList names = new ArrayList();
        System.out.println("Please enter 10 names...");
        for (int i = 0; i < 10; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("Printing names using while looop:  ");
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

        System.out.println("Printing names using do while loop:");
        i = 0;
        do {
            System.out.println(names.get(i));
            i++;
        } while (i < names.size());

        System.out.println("Printing names using for loop");
        for (i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Printing using advanced loop...");

        for (Object var : names) {
            System.out.println(var);
        }

    }


}

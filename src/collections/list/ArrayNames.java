package collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNames {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList names = new ArrayList();
        System.out.println("PLEASE ENTER 10 NAMES");
        for (int i = 0; i < 10; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }


        //  USING WHILE LOOP


        System.out.println("printing names with while loop");
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }


        // USING DO WHILE LOOP

        System.out.println("printing names with do while loop");

        i = 0;
        do {
            System.out.println(names.get(i));
            i++;
        } while (i < names.size());


        // USING ADVANCE LOOP

        System.out.println("printing names with advance loop");
        for (Object var : names) {
            System.out.println(var);
        }

    }
}

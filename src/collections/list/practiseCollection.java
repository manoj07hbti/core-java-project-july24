package collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class practiseCollection {

    public static void main(String[] args) {

        // STORE 10 COUNTRY NAME

        ArrayList country = new ArrayList(); // we have created a array list

        // adding data to list : objectName.add(DATA)

        country.add("BHARAT");
        country.add("THAILAND");
        country.add("EUROPE");
        country.add("DUBAI");
        country.add("AMERICA");
        country.add("LONDON");
        country.add("PAKISTAN");
        country.add("SHRI LANKA");
        country.add("ITALY");
        country.add("PARIS");
        country.add("NEW ZEALAND");

        // for reading data : objectName.get(INDEX);

        System.out.println(country.get(9));

        // with for loop

        for (int i = 0; i <= 10; i++) {
            System.out.println("printing loop:" + country.get(i) + "index:" + i);

        }


        for (int i = 0; i < country.size(); i++) {
            System.out.println(" printing with size:" + country.get(i) + "index:" + i);
        }
        // for delete data : object.remove(index)

        country.remove(5);
        for (int i = 0; i < country.size(); i++) {
            System.out.println(" AFTER REMOVE   printing with size:" + country.get(i) + "index:" + i);

        }

    }

    public static class ArrayNames {


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
}

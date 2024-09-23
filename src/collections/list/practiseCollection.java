package collections.list;

import java.util.ArrayList;

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
}

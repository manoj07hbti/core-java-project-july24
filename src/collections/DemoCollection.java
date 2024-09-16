package collections;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class DemoCollection {

    public static void main(String[] args) {

        // I want to store 10 country names

        // Array List

        ArrayList country= new ArrayList(); // we have a  created list
         // adding data to list : objectName.add(data)

         country.add("FIROZABAD");
         country.add("AGRA");
        country.add("JAIPUR");
        country.add("BIKANER");
        country.add("SHIKOHABAD");
        country.add("MATHURA");
        country.add("DELHI");
        country.add("KANPUR");
        country.add("LUCKNOW");
        country.add("BANGLORE");
        country.add("MAKKHANPUR");
        country.add("UDISHA");
        country.add("KOLKATA");

        // reading data from list : ojb.get(INDEX)

        System.out.println(country.get(9));
        for (int i=0; i<country.size(); i++){
            System.out.println("printing list.."+country.get(i)+":.index."+i);

        }
         // delete data from list : obj.remove(INDEX)

         country.remove(5);
        for (int i=0; i<country.size(); i++){
            System.out.println("AFTER DELETE printing list.."+country.get(i)+":.index."+i);

        }








    }

    
}

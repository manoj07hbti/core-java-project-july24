package collection;

import java.util.ArrayList;

public class Array_List {


    public static void main(String[] args) {

        ArrayList name = new ArrayList();

        name.add("rashmi"); //0


        // reading data from list : obj.get(INDEX)

        System.out.println(name.get(1));

        for (int i = 0; i < name.size(); i++) {

            System.out.println("printing list:" + name.get(i) + "at index:" + i);


         // delete data from list : obj.remove(INDEX);

            name.remove(1);

            for (int j = 0; i < name.size(); i++) {

                System.out.println(" after deleting printing list:" + name.get(i) + "at index:" + i);



            }

        }
    }
}
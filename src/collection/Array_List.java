package collection;

import java.util.ArrayList;

public class Array_List {


    public static void main(String[] args) {

        ArrayList name = new ArrayList();

        name.add("rashmi"); //0
        name.add("rahul"); //1
        name.add("anshul"); //2
        name.add("bashu"); //3
        name.add("inaaya"); //4
        name.add("nelu"); //5
        name.add("rubi");  //6
        name.add("");  //7

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
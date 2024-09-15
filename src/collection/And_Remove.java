package collection;

import java.util.ArrayList;

public class And_Remove {


    public static void main(String[] args) {
        ArrayList names = new ArrayList();

        //adding names

        names.add("VARTIKA");
        names.add("HEMANI");
        names.add("SHILPI");
        names.add("VARTU");
        names.add("ABHIKA");

        // reading data from list : obj.get(INDEX)
         System.out.println(names.get(1));
       for (int i = 0; i < names.size(); i++) {
           System.out.println(names.get(i));
            }

            //for removing data from list =obj.remove();
       names.remove(0);

        for(int i=0; i<names.size(); i++){

            System.out.println("After delete Printing list :" +names.get(i) +" at Index: "+i);

        }
    }

}

package map;

import java.util.HashMap;
import java.util.Set;

public class DemoHash {


    public static void main(String[] args) {

        HashMap hm = new HashMap();

        //1)ADD METHOD
        hm.put(1,"vartika");
        hm.put(2,"himani");
        hm.put(3,"shilpi");
        hm.put(4,"vartu");
        hm.put(5,"va");

        System.out.println(hm);

        Set set = hm.entrySet();

        System.out.println(set);

        //2)key same but value updated
        hm.put(5,"av");

        System.out.println(set);


        //3)null value also cretaed

        hm.put(null,"avva");
        System.out.println(set);

        //4)remove element

        hm.remove(4,"vartu");
        System.out.println(set);

        //5)containskey

        System.out.println(hm.containsKey(4));
        System.out.println(hm.containsKey(5));

        //6)get method

        System.out.println(hm.get(3));

        //7)replace method

        hm.replace(2,"abhi");
        System.out.println(set);

        //8)size method

        System.out.println(hm.size());

        //10)keyset method
        System.out.println(hm.keySet());



    }
}

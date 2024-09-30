package collections.map;

import java.util.HashMap;

public class HashMapString {

    public static void main(String[] args) {


        //  we  create String, String hashmap

        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        System.out.println("we need to String,String Hashmap");

        HashMap<String, String> names = new HashMap<>();
        // add data to Hashmap
        names.put("A", "Himanshu");
        names.put("B", "Bablu");
        names.put("C", "Krishna");
        names.put("D", "Rajan");
        names.put("E", "Rohit");
        // reading data from map: get.(Key)
        System.out.println(names.get("A"));
        System.out.println(names.get("C"));
        System.out.println(names.get("E"));
        System.out.println(names.get("B"));
        System.out.println(names.get("D"));
        //using duplicate key
        names.put("A", "I,M BEST DEVELOPER");
        System.out.println("After Using Duplicate Key : " + names.get("A"));
        //Using null;
        names.put(null, "ravan");
        System.out.println(names);

    }


}


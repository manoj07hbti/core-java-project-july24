package collections.map;

import java.util.HashMap;

public class HashMapDouble {
    public static void main(String[] args) {
        // we create a double and String HashMap
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();
        HashMap<String,Double> price= new HashMap<>();
        // we add data to HashMap
        price.put("iphone",100000.20);
        price.put("samsung",20000.25);
        price.put("oppo",15800.20);
        price.put("vivo",3500.25);
        price.put("laptop",3500000.20);
        price.put("tv",5000.25);
        // reading data from map: get.(Key)
        System.out.println(price.get("iphone"));
        System.out.println(price.get("samsung"));
        System.out.println(price.get("oppo"));
        System.out.println(price.get("vivo"));
        System.out.println(price.get("laptop"));
        System.out.println(price.get("tv"));
        // using Duplicate Key
        price.put("iphone",150000.20);
        System.out.println("after using duplicate key"+price.get("iphone"));
        // using Null
        price.put("null",2000.24);
        System.out.println(price);

    }
}

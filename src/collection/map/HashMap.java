package collection.map;

import java.util.LinkedHashMap;

public class HashMap {
    public LinkedHashMap<java.lang.Integer, String> integerString(){
        LinkedHashMap<java.lang.Integer, String> names=new LinkedHashMap<>();
        names.put(null,"Sohail");
        names.put(1,"Harish");
        names.put(2,"Mahesh");
        return names;

    }
    public LinkedHashMap<String,String> stringString(){
        LinkedHashMap<String,String>cities=new LinkedHashMap<>();
        cities.put("null","Reasi");
        cities.put("a","Jammu");
        cities.put("b","Srinagar");
        return cities;
    }
    public LinkedHashMap<String,Double> stringDouble(){
        LinkedHashMap<String,Double> decimals=new LinkedHashMap<>();
        decimals.put("null",56.89);
        decimals.put("a",25.36);
        decimals.put("b",96.85);
        return decimals;

    }


    public static void main(String[] args) {
        HashMap obj=new HashMap();
        System.out.println("Int key + String value: "+obj.integerString());
        System.out.println("String key + String value: "+obj.stringString());
        System.out.println("String key +Double value: "+obj.stringDouble());






    }
}

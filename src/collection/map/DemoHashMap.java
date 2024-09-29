package collection.map;

import com.sun.org.glassfish.external.amx.MBeanListener;

import java.util.HashMap;

public class DemoHashMap {


    public static void main(String[] args) {
     //HashMap <DataType_Key,DataType_value>objName=new HashMap();

        HashMap<String,String>city=new HashMap<>();

        //Adding data to map.....

        city.put( "A","tundla");
        city.put("B","AGRA");
        city.put("C", "pune");

        //reading data from map: get (key);

        System.out.println(city.get("B"));
        System.out.println(city.get("A"));
        System.out.println(city.get("C"));

        //Cheng ...

        city.put("B","AGRA TO TAJ");
        System.out.println("using duplicate key: "  +city.get("B"));


        city.put(null,"Fir");
        System.out.println(city);




        //2.   string, double.....

        //HashMap <DataType_Key,DataType_value>objName=new HashMap();

        HashMap<String,Double>mobile =new HashMap<>();

        //adding data to map....

        mobile.put("nokiya", 1200.0);
        mobile.put("oppo",15000.0);
        mobile.put("vivo",14000.0);

        //reading data from map: get (key);

        System.out.println(mobile.get("oppo"));
        System.out.println(mobile.get("vivo"));
        System.out.println(mobile.get("nokiya"));

        //Cheng ...

        mobile.put("nokiya",1200.500);
        System.out.println("using duplicate key: " +mobile.get("nokiya"));

      //null value.....

      mobile.put(null,6000.0);
      System.out.println(mobile);



      //3. integer, string....

        //HashMap <DataType_Key,DataType_value>objName=new HashMap();

        HashMap<Integer,String>name =new HashMap<>();

        //adding data to map....

        name.put(1,"RUHI");
        name.put(2,"BULBUL");
        name.put(3,"janvi");

        //reading data from map : get(key);

        System.out.println(3);
        System.out.println(1);
        System.out.println(2);


        //cheng..

        name.put(2,"BUL");
        System.out.println("using duplicate key:" +name.get(2));

        //null value....

        name.put(null,"ruhi");
        System.out.println(name);
    }

}

package collection.map;

import java.util.HashMap;

public class DemoHashMap {


    public static void main(String[] args) {

        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap <Integer, String> courses= new HashMap<>();

        //Adding data to map--->
        courses.put(1,"Java Developer");
        courses.put(2,"Python Developer");
        courses.put(3,"QA Tester");
        // reading data from map :  get(key);

        System.out.println(courses.get(2));
        System.out.println(courses.get(1));
        System.out.println(courses.get(3));
        courses.put(1,"Java Microservice Developer...");
        System.out.println("Using duplicate key :" +courses.get(1));

        courses.put(null,"XYZ...");

        System.out.println(courses);


    }
}

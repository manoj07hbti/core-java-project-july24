package collection.map;

import java.util.HashMap;
import java.util.Set;

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

        //how to iterate map
        // we need keys of map to display all elements in a loop...
        // keySet() is a method which can give you all keys of a map
      Set<Integer> keys =courses.keySet();

          for(Integer var: keys){
              System.out.println("printing Map using loop: "+courses.get(var));
          }

    }
}

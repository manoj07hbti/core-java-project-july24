package collection;

import java.util.ArrayList;

public class DemoList {

    public static void main(String[] args) {
        // I want to store names of 10 cities
        String city1="";
        String city2="";

        //ArrayList

        ArrayList cities= new ArrayList();// we have created a list object
        // adding data to list : objName.add(DATA);
           cities.add("Pune");  //0
           cities.add("Agra");  //1 index
           cities.add("Mumbai");// 2 index
           cities.add("Kanpur");// 3 index
           cities.add("Jaipur"); // 4 index
        // reading data from list : obj.get(INDEX)
        System.out.println(cities.get(3));

        for(int i=0; i<cities.size(); i++){

            System.out.println("Printing list :" +cities.get(i) +" at Index: "+i);
        }
  // delete data from list : obj.remove(INDEX);

        cities.remove(1);

        for(int i=0; i<cities.size(); i++){

            System.out.println("After delete Printing list :" +cities.get(i) +" at Index: "+i);
        }

    }
}

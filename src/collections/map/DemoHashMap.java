package collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoHashMap {

    public HashMap<Integer, String> bookMap(){
        HashMap<Integer, String> books = new HashMap<>();

        books.put(1,"Gulliver Travels");
        books.put(2,"Harry Potter");
        books.put(3,"Three Men in a Boat");

        System.out.println(books.get(2));

        return books;
    }

    public HashMap<String, Double> carPrice(){
        HashMap<String, Double> cars = new HashMap<>();

        cars.put("Verna", 1200000.0);
        cars.put("Slavia", 1800000.0);
        cars.put("Virtus", 1400000.0);

        System.out.println(cars.get("Virtus"));

        return cars;
    }



    public static void main(String[] args) {

        DemoHashMap obj = new DemoHashMap();

//        obj.bookMap();
        HashMap<String, Double> cars=  obj.carPrice();

        Set<String> keys = cars.keySet();

        for(String var : keys){
            System.out.println("Cars Data: "+cars.get(var));
        }








    }

}

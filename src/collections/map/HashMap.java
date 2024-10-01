package collections.map;

import java.util.Set;

public class HashMap {

    public java.util.HashMap<Integer, String> softwareDeveloper() {

        java.util.HashMap<Integer, String> developer = new java.util.HashMap<>();
        developer.put(1, "POWER BI");
        developer.put(2, "JAVA DEVELOPER");
        developer.put(3, "DATA ANALYST");
        developer.put(4, "PYTHON DEVELOPER");

        System.out.println(developer.get(3));

        Set<Integer> develop = developer.keySet();

        for (Integer var : develop) {
            System.out.println("Printing using loops.." + developer.get(var));
        }

        return developer;

    }

    public java.util.HashMap<String, String> cityMap() {
        java.util.HashMap<String, String> cities = new java.util.HashMap<>();

        cities.put("A", "KASHIPUR");
        cities.put("B", "PUNE");
        cities.put("C", "AGRA");
        cities.put("D", "CANADA");

        System.out.println(cities.get("A"));

        Set<String> city = cities.keySet();

        for (String var : city) {
            System.out.println("Printing using loops.." + cities.get(var));
        }

        return cities;
    }


    public static void main(String[] args) {

        HashMap obj = new HashMap();
        obj.softwareDeveloper();
        obj.cityMap();

    }


}

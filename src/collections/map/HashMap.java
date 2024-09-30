package collections.map;

public class HashMap {

    public java.util.HashMap<Integer, String> softwareDeveloper() {

        java.util.HashMap<Integer, String> developer = new java.util.HashMap<>();
        developer.put(1, "POWER BI");
        developer.put(2, "JAVA DEVELOPER");
        developer.put(3, "DATA ANALYST");
        developer.put(4, "PYTHON DEVELOPER");

        System.out.println(developer.get(3));

        return developer;
    }

    public java.util.HashMap<String, String> cityMap() {
        java.util.HashMap<String, String> cities = new java.util.HashMap<>();

        cities.put("A", "KASHIPUR");
        cities.put("B", "PUNE");
        cities.put("C", "AGRA");
        cities.put("D", "CANADA");

        System.out.println(cities.get("A"));

        return cities;
    }


    public static void main(String[] args) {

        HashMap obj = new HashMap();
        obj.softwareDeveloper();
        obj.cityMap();


    }


}

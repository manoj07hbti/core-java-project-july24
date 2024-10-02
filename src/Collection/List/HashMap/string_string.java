package Collection.List.HashMap;

import java.util.HashMap;

public class string_string {

    public static void main(String[] args) {

        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap<String, String> String = new HashMap<>();

        //Adding data

        String.put("Redfort", "Delhi");
        String.put("Tajmahal", "Agra");
        String.put("city", "kanpur");
        String.put("Acctor of city", "mumbai");


        //printing data

        System.out.println(String.get("Redfort"));
        System.out.println(String.get("Tajmahal"));
        System.out.println(String.get("city"));
        System.out.println(String.get("Acctor"));

        // change element with key

        String.put( "Redfort" , "Delhi");
        System.out.println("useing replace of element" + String.get("Tajmahal"));



    }
}

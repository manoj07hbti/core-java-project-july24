package Collection.List.HashMap;


import java.util.HashMap;

public class StringDouble {

    public static void main(String[] args) {


        //HashMap <DataType_Key, DataType_Value> objName= new HashMap<>();

        HashMap<String, Double> products = new HashMap<>();


        //Adding data

        products.put("iphone", 2342.45);
        products.put("Ac", 345.77);
        products.put("Bike", 7000.88);
        products.put("Train ticket", 555.773);


        //printing data

        System.out.println(products.get("iphone"));
        System.out.println(products.get("Ac"));
        System.out.println(products.get("Bike"));
        System.out.println(products.get("Ticket"));

        // change element with key

       products.put("Redfort", 4345.33);
        System.out.println("useing replace of element" +products.get("Ac"));


    }

}


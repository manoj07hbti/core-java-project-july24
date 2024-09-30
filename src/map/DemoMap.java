package map;

import java.util.HashMap;

public class DemoMap {

//HashMap <DataType_Key, DataType_Value> objName= new HashMap();


    public HashMap<Integer, String> moiveName() {

        HashMap<Integer, String> names= new HashMap<>();
        names.put(1,"Stree");
        names.put(2,"Srikanth");
        names.put(3,"Hungama");
        names.put(4,"Chakede");
        names.put(5,"bhagwa");

        System.out.println(names.get(1));

        return names;
    }

    public HashMap<String,Double> personWeight(){

        HashMap<String,Double> weight= new HashMap<>();
       weight.put("A",70.45);
       weight.put("B",75.09);
       weight.put("C", 56.00);
       weight.put("D",60.43);
       weight.put("E",78.10);

        System.out.println(weight.get("C"));

        return weight;

    }

    public static void main(String[] args) {
        DemoMap obj = new DemoMap();
        obj.moiveName();
        obj.personWeight();
    }

}


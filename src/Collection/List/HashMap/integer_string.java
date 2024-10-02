package Collection.List.HashMap;

import java.util.HashMap;

public class integer_string {

  //  create a hashMap of interger key and String value

    public static void main(String[] args) {

    
    //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

       HashMap <Integer , String> citys = new HashMap<>();

        //Adding data

          citys.put( 1 , "Delhi");
          citys.put( 2 , "Agra");
          citys.put( 3 ,"kanpur");
          citys.put( 4 , "mumbai");


          //printing data

        System.out.println(citys.get(1));
        System.out.println(citys.get(2));
        System.out.println(citys.get(3));
        System.out.println(citys.get(4));

        // change element with key

         citys.put( 1 , "Enter of city Delhi");
        System.out.println("useing replace of element" + citys.get(2));


    }

}

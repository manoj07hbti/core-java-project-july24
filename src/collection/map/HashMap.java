package collection.map;


public class HashMap<I,S> {

    public java.util.HashMap<Integer, String> creatname() {


//HashMap <DataType_Key,DataType_value>objName=new HashMap();

java.util.HashMap<Integer,String> name =new java.util.HashMap<>();

//adding data to map....

        name.put(1,"RUHI");
        name.put(2,"BULBUL");
        name.put(3,"janvi");

//reading data from map : get(key);

        System.out.println(name.get(3));
        System.out.println(name.get(1));
        System.out.println(name.get(2));


        //cheng..

        name.put(2,"BUL");
        System.out.println("using duplicate key:" +name.get(2));

        //null value....

        name.put(null,"ruhi");
        System.out.println(name);

        return name;
    }

    public static void main(String[] args) {

        HashMap obj=new HashMap();
        obj.creatname();

            
            
        }
    }


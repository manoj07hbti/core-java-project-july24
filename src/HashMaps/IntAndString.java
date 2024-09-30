package HashMaps;

import java.util.HashMap;

public class IntAndString
{
    public void IntString()
    {
        HashMap<Integer, String> serials= new HashMap<>();
        serials.put(1,"Playstation");
        serials.put(2,"Xbox");
        serials.put(3,"Nintendo");

        System.out.println(serials.get(2));
        System.out.println(serials.get(1));
        System.out.println(serials.get(3));
    }

    public static void main(String[] args)
    {
        IntAndString obj= new IntAndString();
        obj.IntString();
    }
}

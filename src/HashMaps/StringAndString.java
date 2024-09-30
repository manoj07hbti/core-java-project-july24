package HashMaps;

import java.util.HashMap;

public class StringAndString
{
    public void StringString()
    {
        HashMap<String, String> gameStudioSearch= new HashMap<>();
        gameStudioSearch.put("Metal Gear","Konami");
        gameStudioSearch.put("Grand Theft Auto","Rockstar Games");
        gameStudioSearch.put("Assassin's Creed","Ubisoft");

        System.out.println(gameStudioSearch.get("Grand Theft Auto"));
        System.out.println(gameStudioSearch.get("Metal Gear"));
        System.out.println(gameStudioSearch.get("Assassin's Creed"));
    }

    public static void main(String[] args)
    {
        StringAndString obj= new StringAndString();
        obj.StringString();
    }
}

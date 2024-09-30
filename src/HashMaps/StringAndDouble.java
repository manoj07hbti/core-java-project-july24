package HashMaps;

import java.util.HashMap;

public class StringAndDouble
{
    public void StringDouble()
    {
        //Game Prices in Dollars

        HashMap<String, Double> gamePrice= new HashMap<>();
        gamePrice.put("Grand Theft Auto 5",23.60);
        gamePrice.put("Call of Duty",95.44);
        gamePrice.put("Ghost of Tsushima",47.71);

        System.out.println(gamePrice.get("Call of Duty"));
        System.out.println(gamePrice.get("Ghost of Tsushima"));
        System.out.println(gamePrice.get("Grand Theft Auto 5"));
    }

    public static void main(String[] args)
    {
        StringAndDouble obj= new StringAndDouble();
        obj.StringDouble();
    }
}

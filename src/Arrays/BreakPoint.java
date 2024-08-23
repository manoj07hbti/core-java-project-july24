package Arrays;

public class BreakPoint
{
    public static void main(String[] args)
    {
        String Cars []={"BMW","Mercedes","Audi","Porsche","Volkswagen","Skoda"};

        int X=0;
        for(String var: Cars)
        {
            if(var== "Porsche")
            {
                System.out.println("Found "+var+" at the point "+X+" and exiting the loop");
                break;
            }X++;
            System.out.println("Printing the car brand by using advance for loop: "+var);
        }

    }
}

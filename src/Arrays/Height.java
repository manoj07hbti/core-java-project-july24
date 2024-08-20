package Arrays;

public class Height
{
    public static void main(String[] args)
    {
        double Heights []= {5.4, 5.6, 5.10, 5.11, 6.1, 6.3};

        //Printing a specific height value
        System.out.println("Printing a specific height value: "+Heights[4]+" ft");

        //Printing heights by using for loop
        for(int X=0; X<Heights.length; X++)
        {
            System.out.println("Printing heights by using for loop: "+Heights[X]+" ft");
        }

        //Printing heights by using while loop
        int Y=0;
        while (Y<Heights.length)
        {
            System.out.println("Printing heights by using while loop: "+Heights[Y]+" ft");
            Y++;
        }

        //Printing heights by using do while loop
        int Z=0;
        do {
            System.out.println("Printing heights by using do while loop: "+Heights[Z]+" ft");
            Z++;
        }while (Z<Heights.length);

        //Printing heights by using advance for loop
        for(double Feet: Heights)
        {
            System.out.println("Printing heights by using advance for loop: "+Feet+" ft");
        }
    }
}

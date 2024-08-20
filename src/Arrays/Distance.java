package Arrays;

public class Distance
{
    public static void main(String[] args)
    {

        int Distance []= {5,10,15,20,25,30,35,40,45,50};

        //Printing a specific distance value by the array
        System.out.println("Printing a specific distance value: "+Distance[9]+"Km");

        //Printing distances by using for loop
        for(int X=0; X<Distance.length; X++)
        {
            System.out.println("Printing distances by using for loop: "+Distance[X]+"Km");
        }

        //Printing distances by using while loop
        int Y=0;
        while(Y<Distance.length)
        {
            System.out.println("Printing distances by using while loop: "+Distance[Y]+"Km");
            Y++;
        }

        //Printing distances by using do while loop
        int Z=0;
        do {
            System.out.println("Printing distances by using do while loop: "+Distance[Z]+"Km");
            Z++;
        }while (Z<Distance.length);

        //Printing distances by using advance for loop
        for(int Length: Distance)
        {
            System.out.println("Printing distances by using advance for loop: "+Length+"Km");
        }
    }
}

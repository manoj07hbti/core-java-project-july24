package Arrays;

public class Countries
{
    public static void main(String[] args)
    {
        String Country []={"India","USA","China","Germany","Japan","Mexico","Korea","Pakistan","Australia"};

        //Printing a specific country by the Array
        System.out.println("Printing countries: "+Country[8]);

        //Printing every country by using for loop method
        for (int X=0; X<Country.length; X++)
        {
            System.out.println("Printing countries by using '.length': "+Country[X]);
        }

        //Printing every country by using while loop
        int Y=0;
        while(Y<Country.length)
        {
            System.out.println("Printing countries by using while loop: "+Country[Y]);
            Y++;
        }

        //Printing every country by using do while loop
        int Z=0;
        do
        {
            System.out.println("Printing countries by using do while loop: "+Country[Z]);
            Z++;
        }while(Z<Country.length);

        //Printing every country by using advance for loop
        for(String Nation: Country)
        {
            System.out.println("Printing countries by using advance for loop: "+Nation);
        }
    }
}

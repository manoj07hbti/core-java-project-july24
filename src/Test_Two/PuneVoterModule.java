package Test_Two;

public class PuneVoterModule
{
    public static void main(String[] args)
    {
        String Name;
        int Age;

        Name= "Bladezy";
        Age= 20;

        if(Name== "Bladezy" && Age >= 18)
        {
            System.out.println("You are eligible to vote in Pune");
        }
        else
        {
            System.out.println("You are not eligible to vote in Pune");
        }
    }
}

package Practice;

public class VotingSystem
{
    public static void main(String[] args)
    {
        int VoterAge;
        String VoterCity;

        VoterAge= 15;
        VoterCity="Agra";

        if(VoterAge>= 18 && VoterCity== "Agra")
        {
            System.out.println("You are eligible to vote in Agra");
        }else if(VoterAge<= 18 && VoterCity== "Agra")
        {
            System.out.println("You are not eligible to vote in Agra");
        }else if(VoterAge>= 18 && VoterCity != "Agra")
        {
            System.out.println("You belongs to "+VoterCity+" and you can't to vote in Agra");
        }else if(VoterAge< 18 && VoterCity != "Agra")
        {
            System.out.println("You belongs to "+VoterCity+" and you are not eligible to vote in Agra");
        }

    }
}

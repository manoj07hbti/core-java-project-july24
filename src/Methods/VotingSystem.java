package Methods;

public class VotingSystem
{
    public void Voting()
    {
        int Age=23;

        if(Age>=18)
        {
            System.out.println("You are eligible for voting, Your Age: "+Age);
        }else
        {
            System.out.println("You are not eligible for voting, Your Age: "+Age);
        }
    }

    public static void main(String[] args)
    {
        VotingSystem vote = new VotingSystem();
        vote.Voting();
    }
}

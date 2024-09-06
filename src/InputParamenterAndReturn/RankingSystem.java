package InputParamenterAndReturn;

public class RankingSystem
{
    public boolean Ranking(int marks)
    {
        double percent = (double) ((marks/600)* 100);

        if(percent >= 95 && percent < 75)
        {
            return true;
        }
        else if (percent >= 75 && percent < 55)
        {
            return true;
        }
        else if (percent >= 55 && percent < 45)
        {
            return true;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args)
    {
        RankingSystem data= new RankingSystem();
        boolean Scanning = data.Ranking(100);
        System.out.println(Scanning);

        if(Scanning)
        {
            System.out.println("You got the First Rank");
        }
        else if(Scanning)
        {
            System.out.println("You got the Second Rank");
        }
        else if(Scanning)
        {
            System.out.println("You got the Third Rank");
        }
        else
        {
            System.out.println("You failed");
        }
    }
}

package ThriceDataByMethods;

public class PercentageCalculator
{
    public void Percentage(int Total, int Percentage)
    {
        int Result= (Total*Percentage)/100;
        System.out.println(Percentage+"% of "+Total+" is equals to "+Result);
    }

    public static void main(String[] args)
    {
        PercentageCalculator data = new PercentageCalculator();
        data.Percentage(5000,10);
    }
}

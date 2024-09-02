package Methods;

public class PercentageCalculator
{
    public void PercentageFinder()
    {
        double Value = 32;
        double Total = 134;

        double Percentage = (Value / Total) * 100;
        System.out.println("The percentage is: "+Percentage+" %");
    }

    public static void main(String[] args)
    {
        PercentageCalculator Percentage = new PercentageCalculator();
        Percentage.PercentageFinder();
    }
}
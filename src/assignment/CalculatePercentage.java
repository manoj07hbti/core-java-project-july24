package assignment;

public class CalculatePercentage {
    public static void main(String[] args) {
        int percent=7;
        int number=500;
      double result=(number*percent)/100;
        System.out.println("7 % of 500: "+result);

        number=567;
        percent=8;
        result=(double)(number*percent)/100;
        System.out.println("Printing 8% of 567: "+ result);

    }
}

package methods;

public class PercentageofNumber {

    public void checkpercentage(){

        int num =  560;
        int percent= 3;

        double result = (double) (num*percent)/100;
        System.out.println(percent+"% of " +num + " is: " +result);
    }

    public static void main(String[] args) {
        PercentageofNumber obj = new PercentageofNumber();
        obj.checkpercentage();
    }

}


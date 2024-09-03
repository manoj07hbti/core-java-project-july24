package Methods;

import test_28_july_variables.Percentage;

public class Calculate_Percentage {

    //method int number and percentage;

    public void percentage() {

        //SYNTAX; dobule result=(dobule) (number*percentage)/100

        double number = 356322;
        int percentage = 5;

        double result = (double) (number * percentage) / 100;

        System.out.println("printing prcentage" + result);

    }

    public static void main(String[] args) {


        // case 1: create Object using default constructor

        Calculate_Percentage obj = new Calculate_Percentage();

        //  case 2: objName.MethodName();

        obj.percentage();


    }


}

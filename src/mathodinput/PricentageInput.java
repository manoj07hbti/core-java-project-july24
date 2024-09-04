package mathodinput;

public class PricentageInput {

 public void checkpercentage(double number, double percentage){

     double result=(number*percentage)/100;
     System.out.println("percentage check.. "+result);
 }

    public static void main(String[] args) {
     PricentageInput obj=new PricentageInput();

     obj.checkpercentage(5000,10);
     obj.checkpercentage(100,5);
     obj.checkpercentage(1000,10);
    }








}

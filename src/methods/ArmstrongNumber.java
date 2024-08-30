package methods;

public class ArmstrongNumber {

    public void checkArmstrong(){

        int number= 153;
        int remainder= 0;
        int result=0;
        int originalNumber=number;

        while (number!=0){
            remainder = number%10;
            result = (int) (result + Math.pow(remainder, 3));
            number = number/10;
        }

        if(result == originalNumber){
            System.out.println(originalNumber + " is a armstrong number");
        } else {
            System.out.println(originalNumber + " is not a armstrong number");
        }


    }


    public static void main(String[] args) {

        ArmstrongNumber obj =  new ArmstrongNumber();
        obj.checkArmstrong();
    }
}

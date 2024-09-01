package methods;

public class Methods2 {

    // check palindrome number

    public void checkPalindrome() {
        int number = 16461;
        int remainder = 0;
        int reversenumber = 0;
        int originalnumber = number;
        while (number > 0) {
            remainder = number % 10;
            reversenumber = reversenumber * 10 + remainder;
            number = number / 10;
        }
        if (reversenumber == originalnumber) {
            System.out.println("Getting palindrome number.." + originalnumber);
        } else {
            System.out.println("not geeting palindrome number..");
        }
    }

    // check Armstrong number    153   // 1*1*1 + 5*5*5 + 3*3*3 = 153

    public void checkArmstrong() {
        int number = 153;
        int result = 0;
        int remainder = 0;
        int originalnumber = number;
        while (number != 0) {
            remainder = number % 10;
            result = (int) (result + Math.pow(remainder, 3));
            number = number / 10;

        }
        if (originalnumber == result) {
            System.out.println("Getting armstrong number..." + originalnumber);
        } else {
            System.out.println("Not getting number");
        }
    }

    public static void main(String[] args) {
        Methods2 obj = new Methods2();
        obj.checkPalindrome();
        obj.checkArmstrong();

    }


}

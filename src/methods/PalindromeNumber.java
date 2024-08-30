package methods;

public class PalindromeNumber {

    public void checkPalindrome(){
        int number = 122;
        int reverseNum=0;
        int remainder= 0;
        int originalNumber = number;

        while(number != 0){
            remainder  = number%10;
            reverseNum = reverseNum * 10 + remainder;
            number = number/10;
        }

        if(originalNumber == reverseNum){
            System.out.println(originalNumber + " is a palindrome number");
        } else{
            System.out.println(originalNumber + " is not a palindrome number");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        obj.checkPalindrome();
    }

}

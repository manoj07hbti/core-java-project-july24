package methods;

public class Palindrome {

    public void palindrome(){
        int number=1221;
        int rem,rev=0;
        while (number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
            System.out.println(rev);

        }
        if(rev==number){
            System.out.println("Number is Palindrome: "+rev);
        }
        else{
            System.out.println("Number is not Palindrome");
    }
    }

    public static void main(String[] args) {
        Palindrome palin=new Palindrome();
        palin.palindrome();
    }
}

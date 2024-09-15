package test_15_september;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "Y";

        while (!choice.equals("N")){
            System.out.println("Enter the number you want to check: ");
            int num = sc.nextInt();
            sc.nextLine();
            boolean isprime = true;

            for(int i= num -1; i>=2 ; i--){
                if(num % i == 0){
                    isprime = false;
                    break;
                }
            }

            if(isprime){
                System.out.println(num +" is a prime number");
            } else {
                System.out.println(num +" is not a prime number");
            }

            System.out.println("Do you want to check more prime numbers:   Y or N");
            choice = sc.nextLine();

        }
    }

}

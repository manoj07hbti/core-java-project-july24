package test_15_september;

import java.util.Scanner;

public class FindPrimeNumber {


    public void CheckNumber() {

        int value;
        int count = 0;
        System.out.println(" PLEASE ENTER NUMBER ");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;

            }
        }
        if (count == 0) {
            System.out.println(value + "THIS IS A PRIME NUMBER");
        } else {
            System.out.println(value + "THIS IS NOT A PRIME NUMBER");
        }


    }

    public static void main(String[] args) {
        String choice2 = "Y";
        Scanner scanner = new Scanner(System.in);
        FindPrimeNumber obj = new FindPrimeNumber();
        if (choice2.equalsIgnoreCase("y")) ;
        obj.CheckNumber();
        while (choice2.equalsIgnoreCase("Y")) ;
        System.out.println("DO YOU WANT TO CHECK ANOTHER NUMBER PRESS(Y)ANY OTHER KEY PRESS TO EXIT");
        choice2 = scanner.nextLine();
        if (choice2.equalsIgnoreCase("Y")) {
            obj.CheckNumber();
        } else {
            System.out.println("EXIT APPLICATION");
        }


    }

}

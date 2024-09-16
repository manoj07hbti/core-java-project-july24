package scanner_test;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] number={};
        System.out.println("enter number of elements to add: ");
        Scanner scanner=new Scanner(System.in);
        int nel=scanner.nextInt();
        int [] numbers=new int[number.length+nel];
        for(int i=number.length;i<numbers.length;i++){
            System.out.println("Enter element "+(i+1)+";");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Numbers: "+ Arrays.toString(numbers));

}
}
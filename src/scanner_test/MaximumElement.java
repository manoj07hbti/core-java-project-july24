package scanner_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public String maxEl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of your array: ");
        int elements = scanner.nextInt();
        int[] numbers = new int[elements];
        System.out.println("Enter your data in array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }System.out.println("The array is: " + Arrays.toString(numbers));
        int max = numbers[0];
        for (int i = 1; i < elements; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }


        }System.out.println("max element: " + max);
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Finding maximum element in an array:- ");
        String choice = "Y";
        while (choice.equals("Y")) {
            MaximumElement ml = new MaximumElement();
            System.out.println(ml.maxEl());

            System.out.println("Do you want to add more Y or N to exit");
            Scanner s = new Scanner(System.in);
            choice = s.nextLine();
        }


    }
}

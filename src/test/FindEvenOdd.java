package test;

import java.util.Arrays;

public class FindEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {84, 54, 84, 54, 84, 56, 32, 85, 39, 84, 64, 64, 999, 34, 84, 18, 54, 84, 54, 64, 84, 68, 64, 49, 43, 46};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2 )== 0) {
                even++;

            } else {
                odd++;

            }System.out.println("Even Number: " + even);
            System.out.println("Odd Number: " + odd);
        }
    }
}


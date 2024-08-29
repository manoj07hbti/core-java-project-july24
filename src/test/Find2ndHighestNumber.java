package test;

import java.util.Arrays;

public class Find2ndHighestNumber {
    public static void main(String[] args) {
        int [] numbers={84,54,84,54,84,56,32,85,39,84,64,64,999,34,84,18,54,84,54,64,84,68,64,49,43,46};
        Arrays.sort(numbers);
        int secH= numbers.length-2;
        System.out.println(numbers[secH]);
    }
}

package test;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] numbers={84,54,84,54,84,56,32,85,39,84,64,64,999,34,84,18,54,84,54,64,84,68,64,49,43,46};
        Arrays.sort(numbers);

        int start = 0;
        int end = numbers.length - 1;
        int element = 999;

        while (start <= end) {
            int mid = (start + end) / 2;
                if (numbers[mid]==element) {
                    System.out.println("Found number: " + mid);
                    break;
                } else if (numbers[mid] < element) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }

        }
    }


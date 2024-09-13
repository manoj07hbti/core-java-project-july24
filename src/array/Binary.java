package array;
public class Binary {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 12, 15, 17, 23, 25, 28, 32, 39, 37, 49, 59, 69, 78, 85, 95};


        int start = 0;
        int end = numbers.length - 1;
        int element = 69;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == element) {
                System.out.println("Found Number at position " + mid);
                break;
            } else if (numbers[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Number not found in array");
        }
    }









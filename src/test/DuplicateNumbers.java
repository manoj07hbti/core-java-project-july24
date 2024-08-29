package test;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {84, 54, 84, 54, 84, 56, 32, 85, 39, 84, 64, 64, 999, 34, 84, 18, 54, 84, 54, 64, 84, 68, 64, 49, 43, 46};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }
    }
}

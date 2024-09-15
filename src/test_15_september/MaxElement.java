package test_15_september;
import java.util.Scanner;

public class MaxElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int count = 0;

        String choice;
        do {
            if (count >= size) {
                System.out.println("Array is full, can't add more elements.");
                break;
            }

            System.out.print("Enter a number: ");
            array[count] = scanner.nextInt();
            count++;

            System.out.print("Do you want to add more? (Y/N): ");
            choice = scanner.next();
        } while (!choice.equals("N"));

        int maxElement = array[0];
        for (int i = 1; i < count; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("The maximum element is: " + maxElement);
    }
}
package array;

public class DoubleArray {
    public static void main(String[] args) {
        double percentage[] = {35.25, 25.36, 14.36, 45.65, 25.85, 15.95, 75.35, 95.15, 35.75, 85.25};
        for (int i = 0; i < percentage.length; i++) {
            System.out.println("Printing Percentage using advanced for loop : " + percentage[i]);
        }
        int j = 0;
        while (j < percentage.length) {
            System.out.println("Printing Percentage using While loop: " + percentage[j]);
            j++;
        }
        int a = 0;
        do {
            System.out.println("Printing Percentage using do while loop: " + percentage[a]);
            a++;
        } while (a < percentage.length);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Printing Percentage using for loop : " + percentage[i]);
        }

    }
}

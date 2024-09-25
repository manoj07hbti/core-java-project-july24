package collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class IntegerHashSet {

    public HashSet<Integer> createIntegerSet() {

        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> age = new HashSet<>();
        System.out.println("Please enter number of person you want to add");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter age...");
            int personAge = scanner.nextInt();

            age.add(personAge);

        }
        return age;

    }

    public static void main(String[] args) {
        IntegerHashSet obj = new IntegerHashSet();
        for (Integer var : obj.createIntegerSet()) {
            System.out.println("Printing Hash set age..." + var);
        }
    }


}

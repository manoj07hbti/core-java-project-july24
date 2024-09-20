package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenericsInt {

    public ArrayList<Integer> createIntegerList() {
        ArrayList<Integer> age = new ArrayList<>();
        System.out.println("please enter number of persons age...");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("enter your age");
            age.add(scanner1.nextInt());
        }
        return age;
    }

    public static void main(String[] args) {
        ListWithGenericsInt obj = new ListWithGenericsInt();
        for (Integer var : obj.createIntegerList()) {
            System.out.println("Printing number of ages of a person " + var);
        }
    }

}

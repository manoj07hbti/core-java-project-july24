package collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class IntegerHashSet {


    public HashSet<Integer> createIntegerHashSet() {

        // HashSet<DataType> ObjectName= new HashSet<>(); :declare SYNTAX

        HashSet<Integer> SomeNumbers = new HashSet<>();

        System.out.println("Please Enter You Want To Number");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            Integer num = scanner1.nextInt();
            SomeNumbers.add(num);
        }

        return SomeNumbers;


    }

    public static void main(String[] args) {

        IntegerHashSet object = new IntegerHashSet();
        for (String var : object.createIntegerHashSet()) {
            System.out.println("Printing Integer HashSet");
        }


    }
}




package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenericsString {

    // Syntax: collectionname <datatype> objname=new collectionname<>();

    public ArrayList<String> createStringList() {
        ArrayList<String> cityNames = new ArrayList<>();
        System.out.println("please enter number of cities you want to enter :..");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter city name..");
            cityNames.add(scanner1.nextLine());
        }

        return cityNames;
    }

    public static void main(String[] args) {
        ListWithGenericsString obj = new ListWithGenericsString();

        for (String var : obj.createStringList()) {
            System.out.println("Printing city names " + var);


        }
    }
}

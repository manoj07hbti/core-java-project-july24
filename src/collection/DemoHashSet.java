package collection;

import java.util.HashSet;
import java.util.Scanner;

public class DemoHashSet {

    public HashSet<String> createStringSet() {
        //CollectionName <Datatype> objName = new CollectionName<>();
        HashSet<String> course = new HashSet<>();
        System.out.println("please enter number of courses that you want to enter");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("please enter branches:" + (i + 1) + ": ");
            System.out.println("NAMES:");
            String my_course = scanner1.nextLine();
            course.add(my_course);
        }
        return course;
    }

    public HashSet<Integer> createIntSet() {
        //CollectionName <Datatype> objName = new CollectionName<>();
        HashSet<Integer> age = new HashSet<>();
        System.out.println("please enter number of person's age ,that you want to enter");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("please enter age:" + (i + 1) + ": ");
            System.out.println("AGE OF PERSON");
            int my_age = scanner1.nextInt();
            age.add(my_age);
        }
        return age;
    }

    public HashSet<Double> createDoubleSet() {
        //CollectionName <Datatype> objName = new CollectionName<>();
        HashSet<Double> prize = new HashSet<>();
        System.out.println("please enter number of product prize ,that you want to enter");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("please enter product prize:" + (i + 1) + ": ");

            double product_prize = scanner1.nextDouble();
            prize.add(product_prize);
        }
        return prize;
    }

    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        for (String var : obj.createStringSet()) {
            System.out.println("courses are:" + var);
        }

        for (int var1 : obj.createIntSet()) {
            System.out.println("person's age:" + var1);
        }

        for (double var2 : obj.createDoubleSet()) {
            System.out.println("product prize:" + var2);
        }
    }
}


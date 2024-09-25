package Collection.List;

import java.util.HashSet;

import java.util.Scanner;

public class DemoHashSet {

    public HashSet<String> createStringSet() {

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<String> course = new HashSet();

        System.out.println("please enter courses  you want ");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("please enter Section:" + (i + 1) + ": ");

            System.out.println("NAMES:");

            String Course = scanner1.nextLine();

            course.add(Course);
        }
        return course;
    }


    public HashSet<Integer> createIntSet() {

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<Integer> age = new HashSet<>();

        System.out.println("please enter age ,that you want ");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("please enter age:" + (i + 1) + ": ");

            System.out.println("AGE ");

            int Age = scanner1.nextInt();

            age.add(Age);
        }
        return age;
    }


    public HashSet<Double> createDoubleSet() {

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet<Double> prize = new HashSet<>();

        System.out.println("please enter prize ,that you want ");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("please enter  prize:" + (i + 1) + ": ");

            double Prize = scanner1.nextDouble();

            prize.add(Prize);

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

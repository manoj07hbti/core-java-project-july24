package collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class DemoHashSet {

    public HashSet<Integer> createIntegerSet(){

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> roomNumbers = new HashSet<>();
        System.out.println("Enter the number of room Numbers you want to add: ");
        int num= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Room Numbers: ");
        for(int i=0; i<num; i++){
            int roomnum = sc.nextInt();
            roomNumbers.add(roomnum);
        }
        return roomNumbers;
    }

    public HashSet<Double> createDoubleSet(){

        Scanner sc = new Scanner(System.in);
        HashSet<Double> heights = new HashSet<>();
        System.out.println("Enter the number of heights you want to add: ");
        int num= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Height: ");
        for(int i=0; i<num; i++){
            double height = sc.nextDouble();
           heights.add(height);
        }
        return heights;
    }

    public static void main(String[] args) {
            DemoHashSet obj = new DemoHashSet();

            for(int var : obj.createIntegerSet()){
                System.out.println("values of Room Numbers: "+var);
            }

            for(double var : obj.createDoubleSet()){
            System.out.println("values of Heights: "+var);
            }

    }

}

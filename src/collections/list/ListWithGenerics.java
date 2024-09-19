package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWithGenerics {

    public ArrayList<Integer> createIntegerList(){

        ArrayList<Integer> rollNumLists = new ArrayList<>();
        System.out.println("Please enter number of rollNumbers you want to add");

        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<size; i++){
            System.out.println("Please enter your Roll No:");
            rollNumLists.add(sc.nextInt());
        }

        return rollNumLists;

    }

    public static void main(String[] args) {

        ListWithGenerics obj = new ListWithGenerics();

        for(Integer var : obj.createIntegerList()){
            System.out.println("Roll Numbers: "+var);
        }


    }

}

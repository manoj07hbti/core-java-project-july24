package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenerics {

    public  ArrayList<String> createStringList(){
   //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <String> cityNames = new ArrayList<>();
        System.out.println("Please enter number of  cities which you want to enter: ");

        Scanner scanner= new Scanner(System.in);
        int size=scanner.nextInt();

        for(int i=0; i<size; i++){
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Please enter city name: ");
            cityNames.add(scanner1.nextLine());

        }

      return cityNames;
    }


    public static void main(String[] args) {

        ListWithGenerics obj = new ListWithGenerics();
        for (String var: obj.createStringList()){

            System.out.println("We have create City name in list as :"+var);
        }


    }


}

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWithGenerics {

    public ArrayList<String> createString() {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("please enter NUMBERS OF NAMES that u want to enter:");
        Scanner scanner = new Scanner(System.in);
        int size1= scanner.nextInt();
        for (int i = 0; i<size1 ; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("please enter NAMES:");
            names.add(scanner1.nextLine());

        }

        return names;
    }
    public ArrayList <Integer> createInteger(){

        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <Integer> age = new ArrayList<>();
        System.out.println("please enter NUMBER OF PERSON'S AGE that you want to enter:");
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        for(int i = 0; i<size; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("please enter person's AGE:");
            age.add(scanner1.nextInt());

        }
        return age;

    }

    public ArrayList<Double> createDouble(){
        ArrayList <Double> weight= new ArrayList<>();
        System.out.println("please enter NUMBER OF PERSON'S WEIGHT that you want to enter:");
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        for(int i=0; i<size; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("please enter the persons WEIGHT:");
            weight.add(scanner1.nextDouble());
        }
        return weight;
    }

    public static void main(String[] args) {
        ListWithGenerics obj = new ListWithGenerics();
       int j=0;
       for(String var: obj.createString()){
           System.out.println("NAMES of person at index:"+ j+ " "+ "is "+ var);
           j++;
       }

        int i=0;
        for(int var1: obj.createInteger()){
            System.out.println("person's AGE at index:"+ i + " "+ " is :"+ var1);
            i++;
        }
        int l=0;
        for(double var2: obj.createDouble()){
            System.out.println("person's WEIGHT at index :"+ l +" "+ " is "+ var2);
            l++;
        }

    }
}

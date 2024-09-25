package collection.set;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Scanner;

public class DemoHashSet {


    public HashSet<Integer> createIntSet() {

        //collectionName <Datatype>objName =new collectionName<>();

        HashSet<Integer> age = new HashSet<>();
        System.out.println("please enter number of age");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++){
            Scanner scanner1 = new Scanner(System.in);
             System.out.println("age");

             int Age=scanner1.nextInt();

             age.add(Age);
        }
        return age;
    }

    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();

        for(Integer var: obj.createIntSet()){

            System.out.println("printing age..."+var);
        }

    }
}
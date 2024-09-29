package collection.set;

import java.util.LinkedHashSet;

public class IntLinkedHashSet {


    public static void main(String[] args) {

        LinkedHashSet<Integer>number=new LinkedHashSet<>();

        number.add(77);
        number.add(88);
        number.add(99);
        number.add(100);

        for(int var: number) {

            System.out.println(var);

        }
    }
}

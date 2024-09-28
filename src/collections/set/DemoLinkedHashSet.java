package collections.set;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet <String>books= new LinkedHashSet<>();

        books.add("Power of Attraction");
        books.add("rich dad and poor dad");
        books.add("business mind");
        books.add("think growth");
       int i=0;
        for (String var: books){
            System.out.println(var+ i);
            i++;
        }

    }
}

package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public String names() {
        Scanner scanner = new Scanner(System.in);
        ArrayList name = new ArrayList();
        System.out.println("Please enter number of names to enter: ");
        int size=scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Scanner s=new Scanner(System.in);
            System.out.println("Please enter  name: ");
            name.add(s.nextLine());
            System.out.println("Using for loop: " + name.get(i) + " at index: " + i);
        }
        int i=0;
        while(i<size){

            System.out.println("Using while loop: " + name.get(i) + " at index: " + i);
            i++;

        }
        i=0;
        do{
            System.out.println("Using do while loop: " + name.get(i) + " at index: " + i);
            i++;
        }while (i<size);
        i=0;

        for(Object var: name){

            System.out.println("using advanced loop: "+var+" at index: "+i);
            i++;

        }

        return "";
    }

    public static void main(String[] args) {
        Names obj = new Names();
        obj.names();
    }
}

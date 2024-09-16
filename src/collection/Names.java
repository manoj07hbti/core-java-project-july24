package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public String names() {
        Scanner scanner = new Scanner(System.in);
        ArrayList name = new ArrayList();
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Using for loop: " + name.get(i) + " at index: " + i);
        }
        int i=0;
        while(i<10){

            System.out.println("Using while loop: " + name.get(i) + " at index: " + i);
            i++;

        }
        i=0;
        do{
            System.out.println("Using do while loop: " + name.get(i) + " at index: " + i);
            i++;
        }while (i<10);
        i=0;

        for(Object var: name){

            System.out.println("using advanced loop: "+var+" at index: "+i);
            i++;

        }

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Names: ");
        Names obj = new Names();
        System.out.println(obj.names());
    }
}

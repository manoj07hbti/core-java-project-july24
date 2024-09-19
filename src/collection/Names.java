package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList name_s = new ArrayList();

        System.out.println("enter 10 name:");
        for (int i = 0; i <= 9; i++) {

            String n = scanner.nextLine();

            System.out.println("FOR LOOP..> " + "NAME OF" + " " + n + " " + "AT INDEX:" + i);
        }

        System.out.println("PLEASE ENTER 10 NAMES FOR WHILE LOOP");
        int j = 0;
        while (j <= 9) {

            String h = scanner.nextLine();

            System.out.println("WHILE LOOP:" + "name of " + " " + h + " " + "at index" + j);
            j++;
        }
        System.out.println("DO WHILE LOOP:PLEASE ENTER 10 NAMES");
        j = 0;
        do {
            String h = scanner.nextLine();

            System.out.println("DO WHILE LOOP:" + "name of " + " " + h + " " + "at index" + j);
            j++;
        }while(j<=9);

        System.out.println("ADVANCE LOOP:ENTER 10 NAMES");
        int i=0;
        for(Object var: name_s){
            System.out.println("Printing in Advanced loop: "+var +" at index : "+i);
            i++;
        }

    }




}

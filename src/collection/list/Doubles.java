package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Doubles {
    public void doubles(){
        ArrayList doubl=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter size of decimal numbers to enter: ");
        int size=scanner.nextInt();
        for (int i=0;i<size;i++){
            Scanner s=new Scanner(System.in);
            System.out.println("Please enter number: ");
            doubl.add(s.nextDouble());
            System.out.println("Printing numbers using loop : "+doubl.get(i)+" at index: "+i);
        }int i=0;
        while (i<size){
            System.out.println("Printing numbers using while loop : "+doubl.get(i)+" at index: "+i);
            i++;
        }i=0;
        do {
            System.out.println("Printing numbers using do while loop : "+doubl.get(i)+" at index: "+i);
            i++;
        }while (i<size);
        i=0;

        for (Object var:doubl){

            System.out.println("Printing numbers using advanced loop : "+doubl.get(i)+" at index: "+i);
            i++;
        }
    }

    public static void main(String[] args) {
        Doubles obj=new Doubles();
        obj.doubles();
    }
}

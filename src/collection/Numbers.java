package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public void numbers(){
        ArrayList number=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter size of numbers to enter: ");
        int size=scanner.nextInt();
        for (int i=0;i<size;i++){
            Scanner s=new Scanner(System.in);
            System.out.println("Please enter number: ");
            number.add(s.nextInt());
            System.out.println("Printing numbers using loop : "+number.get(i)+" at index: "+i);
        }int i=0;
        while (i<size){
            System.out.println("Printing numbers using while loop : "+number.get(i)+" at index: "+i);
            i++;
        }i=0;
        do {
            System.out.println("Printing numbers using do while loop : "+number.get(i)+" at index: "+i);
            i++;
        }while (i<size);
        i=0;

        for (Object var:number){

            System.out.println("Printing numbers using advanced loop : "+number.get(i)+" at index: "+i);
            i++;
        }
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.numbers();
    }
}

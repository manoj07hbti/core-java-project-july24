package collection.set;

import java.util.HashSet;
import java.util.Scanner;

public class Integer {
    public HashSet<java.lang.Integer> createInteger(){
        HashSet<java.lang.Integer>integer=new HashSet<java.lang.Integer>();
        System.out.println("Please amount to numbers to enter: ");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            Scanner scanner1=new Scanner(System.in);
            int number=scanner1.nextInt();
            integer.add(number);
        }return integer;
    }

    public static void main(String[] args) {
        Integer obj=new Integer();
        for(int var:obj.createInteger()){
            System.out.println("Printing numbers: "+var);
        }
    }
}

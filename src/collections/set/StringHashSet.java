package collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class StringHashSet {

    public  HashSet <String> createStringSet(){
        // SYNTAX: HashSet<DataType> ObjectName= new HashSet<>();
        HashSet <String> Book = new HashSet<>();
        System.out.println("Please Enter Number Do You Want Names");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        for (int i=0; i<size; i++){
           Scanner scanner1 = new Scanner(System.in);
           String bookNames= scanner1.nextLine();
           Book.add(bookNames);

        }
      return Book;

        }

    public static void main(String[] args) {
        StringHashSet obj= new StringHashSet();
       for (String var: obj.createStringSet()){
           System.out.println("print String hashset:"+var);
       }
    }


    }


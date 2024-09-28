package collection;

import model.Employed;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployedArrayList {

    public ArrayList<Employed> createEmployed(){
            ArrayList<Employed>EmployedArrayList=new ArrayList<>();
            Scanner scanner=new Scanner(System.in);

            System.out.println("please enter the number of Employed thats you want to enter");

            int size= scanner.nextInt();

            for(int i=0; i< size; i++ ){

                Scanner scanner1=new Scanner(System.in);

                System.out.println("data of Employed"+(i+1));

                System.out.println("name");
                String name= scanner1.nextLine();

                System.out.println("age");
                int age= scanner1.nextInt();

                System.out.println("department");
                int department= scanner1.nextInt();


            }
            return EmployedArrayList;
        }

        public static void main(String[] args) {

        EmployedArrayList obj=new EmployedArrayList();

            for(Employed var:obj.createEmployed()){

        }
    }



}

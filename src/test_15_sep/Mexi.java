package test_15_sep;

import java.util.Scanner;

public class Mexi {

    public class Maximum {

        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the size of an array ..");
            int size=scanner.nextInt();
            int arr[]=new int[size];
            System.out.println("enter the element of an array..");
            for(int i=0; i<size; i++){
                arr[i]= scanner.nextInt();
            }
            int maxi=arr[0];
            for(int i=1; i<size; i++){
                if(arr[i]>maxi){
                    maxi=arr[i];
                }
            }

            System.out.println("maximum element in an array:"+maxi);
        }

    }




}

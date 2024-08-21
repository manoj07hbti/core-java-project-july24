package loops;

import java.util.Arrays;

public class FindNumberWithIndex {

    public static void main(String[] args) {

        int [] numbers ={1,34,5,6,2,8,5,5,23,54,6,7,577,46,67,3,52,63,33};
     // LINEAR SEARCH
        int i=0;
        for(int var: numbers){

            if(var==33){
                System.out.println("33 is found at INDEX: "+i);

            }
            i++;
        }
     //BINARY SEARCH


    }
}

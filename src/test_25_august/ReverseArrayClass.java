package test_25_august;

public class ReverseArrayClass {

    public static void main(String[] args) {

        int input[]={1,2,3,4,5};

        int start=0;
        int end=input.length-1;

        while(start<end){
            int temp=input[start];
            input[start]=input[end];
            input[end]=temp;
            start++;
            end--;
        }
        System.out.println("reversed array:");

        for(int i=0; i<input.length; i++){
            System.out.println(input[i]+" ");
        }
    }
}

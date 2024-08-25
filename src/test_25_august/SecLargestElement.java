package test_25_august;

public class SecLargestElement {
    public static void main(String[] args) {

        int arr[] = {12,35,1,10,34,1};

        int max= 0;
        int secmax= -1;

        for(int i=0; i<=arr.length-1; i++){

            if(arr[i] > max){
                secmax= max;
                max= arr[i];
            } else if(arr[i]  > secmax && arr[i] != max ){
                secmax = arr[i];
            }




        }

        System.out.println("Second largest element is: " +secmax);

    }
}

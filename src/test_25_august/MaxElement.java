package test_25_august;

public class MaxElement {

    public static void main(String[] args) {

        int arr[] = {1,3,5,2,4};

        int max= arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }

        System.out.println("Max element is : " +max);

    }

}

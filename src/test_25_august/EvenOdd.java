package test_25_august;

public class EvenOdd {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        int   evencount=0 , oddcount=0;

        for(int i=0; i<=arr.length -1; i++){
            if(arr[i] % 2 == 0){
                evencount++;
            } else{
                oddcount ++;
            }
        }

        System.out.println("Number of Even Elements: " +evencount);
        System.out.println("Number of Odd Elements: " +oddcount);

    }
}

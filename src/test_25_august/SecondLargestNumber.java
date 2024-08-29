package test_25_august;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest number..."+arr[1]);
    }

}

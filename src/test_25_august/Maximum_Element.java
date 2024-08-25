package test_25_august;

public class Maximum_Element {

    public static void main(String[] args) {

        int[] arr={1,3,5,2,4};
        int ans=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }

        System.out.println("maximum fond;"+ans);


    }


}

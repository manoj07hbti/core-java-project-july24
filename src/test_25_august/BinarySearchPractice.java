package test_25_august;

public class BinarySearchPractice {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target=40;
        int start=0;
        int end= array.length-1;
            // mid=50

        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==target){
                System.out.println("Number is found at index...."+mid);
                break;

            } else if(array[mid]<target){
                start=mid+1;
            } else{
                end=mid-1;
            }

        }
        System.out.println("Number is  found");
    }


}

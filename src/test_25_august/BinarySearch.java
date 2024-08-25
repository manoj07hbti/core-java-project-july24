package test_25_august;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[]={3,4,8,12,45,60};
        int target= 45;
        boolean isfound=false;

        int start= 0, end= arr.length-1;

        while(start <= end){
            int mid= (start+end) / 2;

            if(arr[mid] == target){
                System.out.println("Target element is at index: " +mid);
                isfound = true;
                break;
            } else if (arr[mid]< target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        if(!isfound){
            System.out.println("Element not present in array");
        }

    }
}

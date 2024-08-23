package loops;

public class BinarySearch {

    public static void main(String[] args) {


            int arr[] = {2,4,5,7,8,9,10,20,30,40,50,60};
            int element = 1;

            int start= 0;
            int end= arr.length - 1;

            while(start<=end){

                int mid = (start + end) / 2;

                if(arr[mid] == element ){
                    System.out.println("Given number has found at position "+mid);
                    break;
                } else if (arr[mid] < element) {
                    start = mid +1;
                } else {
                    end = mid -1;
                }

            }

        System.out.println("Number not found at any index...");
        }

}

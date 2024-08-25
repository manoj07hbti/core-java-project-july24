package test_25_august;

public class BinaryElementClass {

    public static void main(String[] args) {

        int number[]={10,20,30,40,50,60,70};

        int target=10;
        int start=0;
        int end=number.length-1;

        while(start<=end){

            int mid=(start+end)/2;

            if(number[mid]==target){
                System.out.println("the number is found at index:"+mid);
                break;
            }
            else if(number[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("the number is not found at any index");
    }
}

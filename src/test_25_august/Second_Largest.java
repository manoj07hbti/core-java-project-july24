package test_25_august;

public class Second_Largest {

    public static void main(String[] args) {

        int[]arr={12,35,1,10,34,1};

        int first=arr [0], second=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second=first;

            }else if(arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println("second largest element;"+second);

        }



    }




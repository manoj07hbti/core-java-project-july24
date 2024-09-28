package loops;

public class Binary {

    public static void main(String[] args) {

        int arr[]={3,3,5,6,8,1,10,30,40,45,65,94};

        int element=3;

      int  Start=0;

      int end=arr.length -1;

      while (Start<=end){

          int mid= (Start + end) /2;

          if (arr[mid]==element){
              System.out.println("number found is position "+ mid);
              break;

          } else if (arr [mid] < element){
              Start= mid+1;

          }else{
              end = mid-1;
          }
          }



      }







    }




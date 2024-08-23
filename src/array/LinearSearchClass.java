package array;

public class LinearSearchClass {

    public static void main(String[] args) {

        int rollno [] = {12,18,3,18,24,67,88,45,76,56};

 //find the index of 24
        int i=0;

        for(int var:rollno){

            if(var==24){

                System.out.println("24 at the index of :"+i);

                break;
            }
            i++;

        }
        //find the index of 76

        i=0;

        for(int var:rollno){

            if(var==76){

                System.out.println("76 at the index of :"+i);

                break;

            }
            i++;
        }


        
    }
}

package test_25_august;

public class MaximumPractice {
    public static void main(String[] args) {
        int array[]= {1,3,5,2,4};
        int i=0;
        for(int var: array){
            if(var==5){
                System.out.println("Number is found at Index..."+i);
                break;
            }
            i++;

        }
    }


}

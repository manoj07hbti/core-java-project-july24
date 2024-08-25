package test_25_august;

public class Maximum {

    public static void main(String[] args) {
        int array[]={1,3,5,2,4};

        int maximum=array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>maximum){
                maximum =array[i];
            }
        }
        System.out.println("maximum value of an array:"+maximum);
    }



}

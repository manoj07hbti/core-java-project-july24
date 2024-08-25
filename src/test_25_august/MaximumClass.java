package test_25_august;

public class MaximumClass {

    public static void main(String[] args) {

        int num[]={1,3,5,2,4};

        int maxi=num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]>maxi){
                maxi =num[i];
            }
        }
        System.out.println("maximum value of an array:"+maxi);
    }
}

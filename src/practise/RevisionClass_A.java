package practise;

public class RevisionClass_A {

    public static void main(String[] args) {

        //table of 9
        //for loop
        int num = 9;
        for (int a = 1; a <= 10; a++) {
            System.out.println(a + "*" + num + "=" + (num * a));
        }

        //advance loop
        int table[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int var : table) {
            System.out.println("table of 9:" + (var * num));
        }

        //linear search
        //example 1: find the index of number 44
        int search[] = {1, 12, 13, 23, 44, 54, 67, 89};
        int i = 0;
        for (int var : search) {
            if (var == 44) {
                System.out.println("the number 44 found at index:" + i);

                break;
            }
            i++;
        }
        System.out.println("the number is not found at any index");

        //linear search
        //example 2:a) find the index of number 11
        //b) and also find solution when number not in the index

        int digit[]={33,44,55,66,11,22,23};
        i=0;
        for(int var:digit){
            if(var==11){
                System.out.println("the number 11 is found at index:"+i);
                break;
            }
            i++;
        }
        for(int var:digit){
            if(var==10){
                System.out.println("the number at index :"+i);

            break;
            }
            i++;
        }
        System.out.println("the number is found at any index in an digit array");

        //binary search
        //example 1: find the index of number in an array

        int binary[]={12,13,14,15,16,17,18,19,20};

        int target=14;
        int start=0;
        int end=binary.length-1;

        while(start<=end){

            int mid=(start+end)/2;

            if(binary[mid]==target){
                System.out.println("the number found at index:"+mid);
                break;
            }
            else if(binary[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }

    }
}
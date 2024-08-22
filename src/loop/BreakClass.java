package loop;

public class BreakClass {

    public static void main(String[] args) {

        //write a code ,the loop iterates from 1 to 10,
        //but when i equals 5,it terminates the loop

        int num[] ={1,2,3,4,5,6,7,8,9,10};
       for (int var : num){
            if(var==5){
                break;
            }
            System.out.println(var);
        }
    }
}

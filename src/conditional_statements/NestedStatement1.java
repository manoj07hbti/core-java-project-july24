package conditional_statements;

public class NestedStatement1 {

    public static void main(String[] args) {


        //number is greater than 0 &divisible by 5
        int num=30;

        if(num>0){
            System.out.println("THE NUMBER IS GREATER THAN 0:"+num);
        }
        if(num%5==0){
            System.out.println("DIVISIBLE BY 5:"+"THE NUMBER IS:"+num);
        }
        else {
            System.out.println("NOT DIVISIBLE BY 5:"+"THE NUMBER IS:"+num);
        }

         num=53;

        if(num>0){
            System.out.println("THE NUMBER IS GREATER THAN 0:"+num);
        }
        if(num%5==0){
            System.out.println("DIVISIBLE BY 5:"+"THE NUMBER IS:"+num);
        }
        else {
            System.out.println("NOT DIVISIBLE BY 5:"+"BECAUSE THE NUMBER IS:"+num);
        }

        //example1)-number is odd and divisible by 7
        num=30;

        if(num%3==0){
            System.out.println("THE NUMBER IS ODD:"+num);
        }
        if(num%7==0){
            System.out.println("DIVISIBLE BY 7:"+"THE NUMBER IS:"+num);
        }
        else {
            System.out.println("NOT DIVISIBLE BY 7:"+"THE NUMBER IS:"+num);
        }

        num=21;

        if(num%3==0){
            System.out.println("THE NUMBER IS ODD:"+num);
        }
        if(num%7==0){
            System.out.println("DIVISIBLE BY 7:"+"THE NUMBER IS:"+num);
        }
        else {
            System.out.println("NOT DIVISIBLE BY 7:"+"BECAUSE THE NUMBER IS:"+num);
        }

        //example2)-number is prime number and divisible by 3

        num=31;

        if(num%num==0) {
            System.out.println("IT IS A PRIME NUMBER:" + num);
        }
        if(num%3==0){
            System.out.println("DIVISIBLE BY 3:"+num);
        }
        else{
            System.out.println("NOT DIVISIBLE BY 3:"+num);
        }

        num=3;

        if(num%num==0) {
            System.out.println("IT IS A PRIME NUMBER:" + num);
        }
        if(num%3==0){
            System.out.println("DIVISIBLE BY 3:"+num);
        }
        else{
            System.out.println("NOT DIVISIBLE BY 3:"+num);
        }

    }
}

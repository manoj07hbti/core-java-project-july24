package conditional_statements;

public class OrOperatorAssignment {

    public static void main(String[] args) {

        //EXAMPLE1: write a code for division selection
       //case1: 33<=percent>60


       int percent=45;

        if(percent>=33 && percent<60) {
            System.out.println("SECOND DIVISION:" + percent);
        }else{
            System.out.println("NO DIVISION");
        }
         percent=20;

        if(percent>=33 && percent<60) {
            System.out.println("SECOND DIVISION:" + percent);
        }else{
            System.out.println("NO DIVISION");
        }

        //case2: 60<=percent>75
        percent=65;
        if(percent>=60 && percent<75) {
            System.out.println("FIRST DIVISION:" + percent);
        }else{
            System.out.println("SECOND DIVISION:"+percent);
        }

        percent=55;
        if(percent>=60 && percent<75) {
            System.out.println("FIRST DIVISION:" + percent);
        }else{
            System.out.println("SECOND DIVISION:"+percent);
        }

        //case3: percent>75

        percent=89;
        if(percent>75) {
            System.out.println("GOLD DIVISION:" + percent);
        }else{
            System.out.println("FIRST DIVISION:"+percent);
        }

        percent=60;
        if(percent>75) {
            System.out.println("GOLD DIVISION:" + percent);
        }else{
            System.out.println("FIRST DIVISION:"+percent);
        }

        //EXAMPLE 2:Write a code to check age group
        //case1: 0<age<18

        int age=17;

        if(age>0 && age<18){
            System.out.println("CHILD:"+age);
        }else{
            System.out.println("PROVIDE POSTIVE AGE NUMBER:"+age);
        }

         age=-2;

        if(age>0 && age<18){
            System.out.println("CHILD:"+age);
        }else{
            System.out.println("PROVIDE POSTIVE AGE NUMBER:"+age);
        }

        //case2: 18<age<=40

        age=24;

        if(age>18 && age<=40){
            System.out.println("YOUNG:"+age);
        }else{
            System.out.println("CHILD:"+age);
        }

        age=16;

        if(age>18 && age<=40){
            System.out.println("YOUNG:"+age);
        }else{
            System.out.println("CHILD:"+age);
        }

        //case3: age>=60

        age=70;

        if(age>=60){
            System.out.println("OLD AGE:"+age);
        }else{
            System.out.println("MAY BE CHILD OR YOUNG:"+age);
        }

        age=16;

        if(age>=60){
            System.out.println("OLD AGE:"+age);
        }else{
            System.out.println("MAY BE CHILD OR YOUNG:"+age);
        }

        //EXAMPLE 3:write a code to identify number which is not divisible by 3

        //case1: number is not divisible by 3
        int num=28;

        if(!(num%3==0)) {
            System.out.println("number is not divisible by 3:" + num);
        }else{
            System.out.println("number is divisible by 3:" +num);
        }

        //case2:number is divisble by 3
         num=30;

        if(!(num%3==0)) {
            System.out.println("number is not divisible by 3:" + num);
        }else{
            System.out.println("number is divisible by 3:" +num);
        }


    }
}

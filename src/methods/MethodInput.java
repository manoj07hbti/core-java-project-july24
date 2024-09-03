package methods;

public class MethodInput {

    //1)write a method for cube of any number

    public void cube(int a){

        System.out.println("cube of given number:"+a*a*a);

    }

    //2)write a method for calculator with the help of input parameter

    public void add(int b, int c){

      int result= b+c;

        System.out.println("adding given number:"+result);

    }

    public void sub(int b, int c){

        int result= b-c;
        System.out.println("subtracting given number:"+ result);
    }

    public void multi(int a, int b){
        int result =a*b;
        System.out.println("multiplication of given number:"+result);
    }

    public void div(int a, int b){

        double result = (double)a/b;
        System.out.println("division of given number:"+result);
    }

    //3)write a method to calculate percentage of given number

    public void percent(int a , int b){

      double result = ((double)a/b)*100;
        System.out.println("percent of given number:"+ result);
    }

    //4) write a methor for factorial of given number

    public void factorial(int num){

        int factorial=1;
        for(int i=num; i>0; i--) {

            factorial = factorial * i;
        }
            System.out.println("factorial of given"+" "+num+"is:"+factorial);
    }

    //write a method to check if given number is prime or not

    public void prime(int num){

        boolean isPrime=true;

        for(int i=2; i<num; i++) {
            if (num % i == 0) {
                System.out.println("number is not prime, divisible by other number:"+i);
                isPrime = false;
            }
        }
           if(isPrime){
               System.out.println("NUMBER IS PRIME:"+ num);
        }else{
               System.out.println("number not prime:"+ num);
           }
    }


    public static void main(String[] args) {

     MethodInput obj = new MethodInput();
     obj.cube(9);
     obj.cube(10);
     obj.cube(11);
     obj.add(9,5);
     obj.add(10,11);
     obj.add(12,13);
     obj.sub(17,7);
     obj.sub(10,5);
     obj.sub(3,1);
     obj.multi(10,2);
     obj.multi(11,11);
     obj.multi(12,2);
     obj.div(12,3);
     obj.div(30,2);
     obj.div(17,4);
     obj.percent(2000,18);
     obj.percent(1750,32);
     obj.percent(5000,50);
     obj.factorial(5);
     obj.factorial(4);
     obj.factorial(3);
     obj.prime(13);
     obj.prime(6);
     obj.prime(7);
     obj.prime(21);
    }




}

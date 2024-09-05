package methods;

public class MethodReturntype {


    //1)write a method for even odd by using method return type

    public boolean evenodd (int num){

      if(num%2==0){
          return true;
      }
      else{
          return false;
      }
    }

    //2)write a method for factorial by using method return type

    public int facto (int a){

       int  factorial=1;
        for(int i=a; i>1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    //3)write a method for prime number by using method return type

    public boolean prime(int num){

    boolean isprime = true;
    for(int i=2; i<num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return isprime;
    }

    //4)write a method for calculator by using method return type

    public int add(int a, int b){
        int add=a+b;
        return add;
    }

   public int subt(int a, int b){
        int result =a-b;
        return result;
   }

   public int multi(int a , int b){
        int result = a*b;
        return result;
   }

   public double div(int a , int b){
        double result =(double)a/b;
        return result;
   }

   //5)write a method to check division of student by using method return type

    public double student (double num, double percent) {

        double result = ((double) num / percent) * 100;
        return result;
    }

    public static void main(String[] args) {

        MethodReturntype obj = new MethodReturntype();
        boolean result = obj.evenodd(20);
        System.out.println(result);
        if (result) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        result = obj.evenodd(13);
        System.out.println(result);
        if (result) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        int f = obj.facto(5);
        System.out.println(f);

        f = obj.facto(4);
        System.out.println(f);

        boolean find = obj.prime(13);
        System.out.println(find);
        if (find) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime");
        }

        find = obj.prime(18);
        System.out.println(find);
        if (find) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime");
        }

        int s = obj.add(5, 5);
        System.out.println(s);

        s = obj.add(10, 15);
        System.out.println(s);

        int r = obj.subt(20, 15);
        System.out.println(r);

        r = obj.subt(30, 20);


        int m = obj.multi(10, 10);
        System.out.println(m);

        m = obj.multi(20, 8);
        System.out.println(m);

        double d = obj.div(345, 7);
        System.out.println(d);

        d = obj.div(245, 5);

        double p=obj.student(789, 1000);
        System.out.println(p);
       if(p>75){
           System.out.println("first rank:");
       } else if(p>60){
           System.out.println("second rank:");
       }else if(p>50){
           System.out.println("third rank:");
       }else{
           System.out.println("fail:");
       }


        p=obj.student(200,1000);
        System.out.println(p);
        if(p>75 ){
            System.out.println("first rank:");
        } else if(p>60 ){
            System.out.println("second rank:");
        }else if(p>50){
            System.out.println("third rank:");
        }else{
            System.out.println("fail:");
        }

    }
}

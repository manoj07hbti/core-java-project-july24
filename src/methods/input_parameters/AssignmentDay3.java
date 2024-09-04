package methods.input_parameters;

public class AssignmentDay3 {

    public void getCube(int num){
        System.out.println("cube of " +num +" is: " +num*num*num);
    }

    public void checkPrime(int num){
        boolean is_prime= true;
        for(int i=num-1;i>1;i--){
            if(num % i == 0){
                is_prime = false;
            }
        }
        if(is_prime){
            System.out.println(num + " is a prime number ");
        } else {
            System.out.println(num + " is not a prime number ");
        }
    }

    public void getFactorial(int num){
        int result=1;
        for(int i=num;i>0;i--){
            result = result*i;
        }
        System.out.println("Factorial of "+num +" is:  " +result);
    }

    public void getPercentage(int num, int percent){
        double result = (double) (num*percent)/ 100;
        System.out.println(percent +"% of "+num +" is: " +result);
    }

    public static void main(String[] args) {

        AssignmentDay3 obj = new AssignmentDay3();
        obj.getCube(4);
        obj.checkPrime(7);
        obj.getFactorial(5);
        obj.getPercentage(550,7);

    }
}

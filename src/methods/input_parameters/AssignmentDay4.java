package methods.input_parameters;

public class AssignmentDay4 {

    public boolean checkEven(int num){
        if(num % 2 == 0){
            return  true;
        }
        return false;
    }

    public boolean checkPrime(int num){


        boolean is_prime= true;

        for(int i=num-1;i>1;i--){
            if(num % i == 0){
                is_prime = false;
            }
        }

        return is_prime;

    }

    public int getFactorial(int num){
        int result=1;
        for(int i=num;i>0;i--){
            result = result*i;
        }
        return result;
    }


    public double checkDivision(int subj1marks, int subj2marks, int subj3marks, int subj4marks, int subj5marks, int subj6marks){
        double  percentage =  ( ( double) (subj1marks + subj2marks +subj3marks +subj4marks+ subj5marks +subj6marks)/ 600 ) *100;
        return percentage;

    }


    public static void main(String[] args) {
        AssignmentDay4 obj = new AssignmentDay4();

        boolean isEven =   obj.checkEven(7);
        if(isEven){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }


        boolean isPrime = obj.checkPrime(31);
        if(isPrime){
            System.out.println("prime Number");
        } else{
            System.out.println("Not a Prime Number");
        }

        int factorial= obj.getFactorial(5);
        System.out.println("Factorial : " +factorial);



       double percentage =  obj.checkDivision(85,45,96,75,66,90);
        if(percentage >= 40 && percentage < 60){
            System.out.println("Third Divisino");
        } else if(percentage>= 60 && percentage <80 ){
            System.out.println("Second Division");
        } else if (percentage>= 80) {
            System.out.println("First Division");
        } else {
            System.out.println("Fail");
        }
    }




}

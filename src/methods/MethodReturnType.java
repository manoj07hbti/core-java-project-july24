package methods;

public class MethodReturnType {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

   // write a method which will make sum of two given number 4+6=10

   public  int sum( int a, int b){
       int sum=a+b;
       return sum;
   }

   //write a method which will give you welcome message to a Person name
    public String message(String name){

       String welcome= "Hello, Welcome to Java methods concept "+name;

       return welcome;
    }

    // write a method to find eligible voter in AGRA boolean : true or false

    public boolean eligibleVoter(int age , String city){

       if (age>=18 && city=="AGRA"){
           return true;
       }else {
           return false;
       }

    }

    public String evenOrOdd(int number){
       String result="";
       if(number%2==0){
         result="Given number is Even Number..."+number;
       }else
       {
           result="Given number is Odd Number..."+number;
       }

       return result;
    }

    public static void main(String[] args) {

       MethodReturnType obj= new MethodReturnType();
       int result=  obj.sum(3,8);
       System.out.println(result);

       String message= obj.message("Jatin");
       System.out.println(message);

      boolean output= obj.eligibleVoter(17,"AGRA");
      System.out.println(output);

        if(output){
            System.out.println("Eligible for voting in AGRA");
        }else {
            System.out.println("Not Eligible for voting in AGRA");
        }
         output= obj.eligibleVoter(19,"AGRA");
        System.out.println(output);

        if(output){
            System.out.println("Eligible for voting in AGRA");
        }else {
            System.out.println("Not Eligible for voting in AGRA");
        }

        System.out.println(obj.evenOrOdd(24));


    }



}

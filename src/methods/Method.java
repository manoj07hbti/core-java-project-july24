package methods;

public class Method {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

       public  void makeSquare(){

           int number=11;

           System.out.println("Square of given number is : "+ number*number);

       }

       public void voting(){
           int age=11;
           if(age>18){
               System.out.println("Eligible for Voting...");
           }
           else {
               System.out.println("Not Eligible for Voting...as your age is :"+age);
           }

       }

    public static void main(String[] args) {
      // STEP 1 : create object using default constructor

        Method obj= new Method();
        obj.makeSquare();
        obj.voting();


    }




}

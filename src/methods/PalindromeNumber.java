package methods;

public class PalindromeNumber {


    // example ...number 121,151,11

    public void pn(){
      int number =121;

      int org_number = number;

      int rev=0;
      while(number!=0){

//          //dry ran
//          rev =0;
//          orignial number =121;
//
//          round 1)while(121!=0) enter in the loop
//                  rev= rev*10 + number %10
//                     =0 +121%10 =>  r=1
//                  number = number/10
//                          121/10=>   number =12;
//               check while loop(12!=0);
//
//               round 2)rev= rev*10 + number %10
//                            =10 +12%10 =>  10+2 => r=12;
//                      number = number/10
//                               12/10=>   number =1;
//
//                 check while loop(1!=0);
//
//                round 3)rev= rev *10 + number %10
//                            =120 +1%10 =>  120+1 => r=121;
//                      number = number/10
//                               1/10=>   number =0;

          rev = rev*10 + number % 10;
          number = number/10;

      }
      if(org_number==rev){
          System.out.println("palindrome number:"+org_number);
      }
      else{
          System.out.println("not palindrome number:"+org_number);
      }

    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        obj.pn();
    }



}

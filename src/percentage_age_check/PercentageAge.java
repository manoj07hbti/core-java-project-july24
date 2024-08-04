package percentage_age_check;

public class PercentageAge {

    public static void main(String[] args) {

//1.   write a code to check %of student

 //1.  TRUE && TRUE =TRUE
  int number =50;

   if(number>=33 && number < 60){
       System.out.println("printing by  this person second division..");
   } else{
       System.out.println("this person not second division..");
   }

   //2. TRUE && FALSE =FALSE
        number=55;
     if(number >= 33 && number <60){
         System.out.println("printing this person is second division..");
     } else{
         System.out.println("this person is not second division..");
     }

    //3.  FALSE && TRUE=FALSE

     if(number>=33 && number<60 ){
         System.out.println("printing person is second division..");
     } else{
         System.out.println("person is not is second division.. ");
     }
   //4. FALSE && FALSE =FALSE

        if(number>=33 && number<60){
            System.out.println("person is a second division..");
        }else{
            System.out.println("person is not second division..");
        }

        // percentage >=60 and <75; first division

      //1.  TRUE && TRUE = TRUE
        number=70;
        if(number>=60 && number < 75){
            System.out.println("person is a pass first division");
        }else{
            System.out.println("person not fist division");
        }
      //2.  TRUE && FALSE = FALSE

       number =80;
        if(number >=60 && number <75){
            System.out.println("person is first division");
        }else{
           System.out.println("person not first division");
        }
      //3. FALSE && TRUE =FALSE
      number=65;
        if(number >=60 && number<75){
            System.out.println(" person is first division");
        }else{
            System.out.println("person is not first division");
        }
       //4. FALSE && FALSE = FALSE
        number =80;
        number=70;
        if(number >60 && number<75){
            System.out.println("person is fist division ");
        }else{
            System.out.println("person is not first division");
        }


    }

}












package test_4_august;

public class TestJava {
    public static void main(String[] args) {

 //check student to check% of student

 //1. TRUE && TRUE = TRUE
 //Percentage>=33 &&< 60 second division

 int number=  50;
  if(number>=33 && number <=60){
      System.out.println("person is pass second division");
  }else{
      System.out.println("person is not second division");
  }
   //2. TRUE && FALSE =FALSE
        number=65;
    if(number>=33 && number<=60){
        System.out.println("person is pass second division");
    } else{
        System.out.println("person is not pass second division");
    }
    //3. False && TRUE =FALSE
        number=50;
     if(number>=33 && number<=60){
         System.out.println("person pas to second division");
     }else{
         System.out.println("person is not pass to second division");
     }
     //4. FALSE && FALSE =FALSE

        if(number >=33 && number<=60){
            System.out.println("person is pass second division");
        }else{
            System.out.println("person is not pass second division");
        }
        // percentage >=60 && <75 first division
        //TRUE && TRUE =TRUE

         number=70;
        if(number >=60 && number <=75){
            System.out.println("printing by person pass first division");
        }else{
            System.out.println("person is not pass to first division");
        }
        //2.   TRUE && FALSE=FALSE
        number=80;
        if(number>=60 && number <=75){
            System.out.println("person is pass to first division");
        }else{
            System.out.println("peron is not pass first division");
        }
      //3. FALSE && TRUE =FALSE
        number=70;
        if(number>=60 && number<=75){
            System.out.println("person is pass to first division ");
        }else{
            System.out.println("person is not pass first division");
        }
        //4. FALSE && FALSE=FALSE

        if(number >=60 && number<=75){
            System.out.println("person is first division ");
        }else{
            System.out.println(" person is not first division");
        }
      //3.  percentage > 75 gold madelist
      // TRUE && TRUE =TRUE
        number=75;
        if(number>75 && number<=90){
            System.out.println("person is a gold madlist ");
        }else{
            System.out.println("person is not gold mad");
        }
       //2.  TRUE && FALSE=FALSE
        number=80;
        if(number>=75 && number<=90){
            System.out.println("person is gold mad");
        }else{
            System.out.println("person is not gold mad");
        }
        //3  FALSE && TRUE=FALSE
        number=80;
        if(number>=75 && number<=90){
            System.out.println("person is gold mad");
        }else{
            System.out.println("person not gold mad");
        }
        //4  FALSE && FALSE= FALSE
        if(number>=75 && number<=90){
            System.out.println("person gold mad");
        }else{
            System.out.println("person not gold mad");
        }

    }


}

import com.sun.deploy.security.SelectableSecurityManager;

public class PractiseClass1 {


    public static void main(String[] args) {

        //1)grade classification
       int value=76;

       if(value>=90){
            System.out.println("grade A");
        }else if(value>=80){
            System.out.println("grade B");
        }else if(value>=70){
            System.out.println("grade C");
        }else if(value>=60){
            System.out.println("grade D");
        }else if(value>=50){
            System.out.println("grade E");
        }else{
            System.out.println("grade F");
        }
        //2)Write a program that takes an integer (1-7)
        //and determines the corresponding day of the week (e.g., 1 = Monday, 2 = Tuesday, etc.).

        int day=3;

       if(day<=1){
           System.out.println("MONDAY");
       }else if(day<=2){
           System.out.println("TUESDAY");
       }else if(day<=3){
           System.out.println("WEDNESDAY");
       }else if(day<=4){
           System.out.println("THRUSDAY");
        }else if(day<=5){
           System.out.println("FRIDAY");
       }else if(day<=6){
           System.out.println("SATURDAY");
       }else if(day<=7){
           System.out.println("SUNDAY");
       }


        //3)Determine if a Temperature is Comfortable:
        //Write a program that checks if the temperature is within a comfortable range.
        // The temperature is considered comfortable if it is between 60 and 75 degrees Fahrenheit.

        int temp= 52;
       if(temp>60 && temp<75){
            System.out.println("temperature is suitable");
        }else{
            System.out.println("temperature is not suitable");
        }
       //4)Determine if a Day is a Weekend:
        //Write a program that checks if a given day (represented by an integer) is a weekend.
        // The weekend includes Saturday (6) and Sunday (7)

        day=6;

       if(day>=1 && day<=5){
           System.out.println("working days");
       }else if(day<=6){
           System.out.println("weekend days");
       }

        //5)Check if a Person can Rent a Car:
        //Write a program that checks if a person can rent a car.
        //The person must be at least 21 years old and have a valid driver’s license.

        int age=22;
       String vehicle="CAR";

       if(age>=21 && vehicle=="CAR"){
           System.out.println("person can rent a car");
       }else{
           System.out.println("person cannot applicable for rent a car");
       }

        //6)Check for Admission Eligibility:
        //Write a program that checks if a student is eligible for admission.
        //The student must have an exam score greater than or equal to 60 and must have completed at least 12 years of schooling.

        int marks=64;
       int schooling=12;

       if(marks>=60 && schooling>=12){
           System.out.println("student is eligible for admission ");
       }else{
           System.out.println("student is not elligible for admission");
       }

       //7)Find Out if a Person Qualifies for a Special Offer:
        //Write a program that determines if a person qualifies for a special offer.
        // The person qualifies if they are either a senior citizen (isSenior)
        // and they have made a purchase of at least $20.

        int dollar=23;
       String person="senior";

       if(dollar>=20 && person=="senior"){
           System.out.println("person qualifies for special offer");
       }else{
           System.out.println("not qualifies for special offer");
       }

    }
}

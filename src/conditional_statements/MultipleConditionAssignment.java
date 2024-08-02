package conditional_statements;

public class MultipleConditionAssignment {

    public static void main(String[] args) {

        // 1 write a code to check student got marks greater than 60 and have a science section student

        // 1 case TRUE && TRUE = TRUE

        int marks= 65;
        String stream= "SCIENCE";
        if(marks>=60 && stream== "SCIENCE"){
            System.out.println("Student passed out by first division...");
        } else{
            System.out.println("Student failed in exam...");
        }

          // 2. case  TRUE && FALSE = FALSE

        stream="COMMERCE";
        if(marks>=60 && stream=="SCIENCE"){
            System.out.println("Student is from science stream");
        } else{
            System.out.println("Student is not from science stream");
        }

        // 3. case  FALSE && TRUE = FALSE

        marks=55;
        stream="SCIENCE";

        if(marks>=60 && stream=="SCIENCE"){
            System.out.println("Student passes out by first division");
        } else{
            System.out.println("Student failed in exam ");
        }

        // 4. case FALSE && FALSE = FALSE

        marks=55;
        stream="ARTS";
        if(marks>=60 && stream=="SCIENCE"){
            System.out.println("Student passed in exam...");

        } else{
            System.out.println("Student failed in exam...");
        }

        // 2 write a code to find eligible voter of UP

        // age>= 18 && String state= UP

        int age = 21;
        String state= "UP";

        // 1 case TRUE && TRUE = TRUE

        if(age>=18 && state=="UP"){
            System.out.println(" Person is Eligible for vote in UP");
        } else{
            System.out.println("Person is not eligible");
        }

        // 2 case TRUE && FALSE = FALSE

        state="UTTARAKHAND";
        if(age>=18 && state=="UP"){
            System.out.println("Person is eligible for vote in up");
        } else{
            System.out.println("Person is not eligible for vote in UP");
        }

        // 3 case FALSE && TRUE = FALSE

        age=17;
        state="UP";
        if(age>=18 && state=="UP"){
            System.out.println("Person is eligible for vote in UP");

        } else{
            System.out.println("Person is not eligible for vote in UP");
        }

        // 4 case FALSE && FALSE = FALSE

        age=16;
        state="UTTARAKHAND";
        if(age>=18 && state=="UP"){
            System.out.println("Person is eligible for vote in UP");
        } else{
            System.out.println("Person is not eligible for vote in UP");
        }




    }




}

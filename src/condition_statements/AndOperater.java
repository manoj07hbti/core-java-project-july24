package condition_statements;

public class AndOperater {


    public static void main(String[] args) {



        int marks=60;
        String section="SCIENCE";
        //1. TRUE && TRUE = TRUE
        if (marks>=60 && section=="SCIENCE"){
            System.out.println("student passed in science..."+marks);
        }else {
            System.out.println("student not passed in science..."+marks);
        }

        // TRUE && FALSE
         marks=60;
         section="physics";
        if (marks>=60 && section=="SCIENCE"){
            System.out.println("student passed in science..."+marks);
        }else {
            System.out.println("student not passed in science..."+marks);
        }

      // FALSE && TRUE

        marks=59;
        section="SCIENCE";
        if (marks>=60 && section=="SCIENCE"){
            System.out.println("student passed in science..."+marks);
        }else {
            System.out.println("student not passed in science..."+marks);
        }


        marks=55;
        section="english";

        if (marks>=60 && section=="SCIENCE"){
            System.out.println("student passed in science..."+marks);
        }else {
            System.out.println("student not passed in science..."+marks);
        }

      // TRUE && TRUE

       int age=18;
        String state="UTTAR PRADESH";

        if (age>=18 && state=="UTTAR PRADESH"){
            System.out.println("person is valid for voting..."+state);
        }else {
            System.out.println("person is NOT valid for voting..."+state);
        }


        // 2 =FIND ELIGIBLE VOTER OF UP

         // TRUE && FALSE

         age=18;
        state="RAJSHTHAN";
        if (age>=18 && state=="UTTAR PRADESH"){
            System.out.println("person is valid for voting..."+state);
        }else {
            System.out.println("person is NOT valid for voting..."+state);
        }

       //FALSE && TRUE
        age=16;
        state="UTTAR PRADESH";
        if (age>=18 && state=="UTTAR PRADESH"){
            System.out.println("person is valid for voting..."+state);
        }else {
            System.out.println("person is NOT valid for voting..."+state);
        }

       // FALSE && FALSE
        age=17;
        state="RAJSHTHAN";

        if (age>=18 && state=="UTTAR PRADESH"){
            System.out.println("person is valid for voting..."+state);
        }else {
            System.out.println("person is NOT valid for voting..."+state);
        }




    }









}

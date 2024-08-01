package conditional_statements;

public class AndOperatorExample {

    public static void main(String[] args) {

        //AND OPERATOR
        //Condition First--> 1*1 = 1

        int marks=69;
        String stream="SCIENCE";

        if(marks>=60 && stream=="SCIENCE"){
            System.out.println("student got 60% marks in science stream");
        }else {
            System.out.println("student do not applicable for science");
        }

        //condition second-->1*0 = 0

        marks=67;
        stream="MATHS";

        if(marks>=60 && stream=="SCIENCE"){
            System.out.println("student got 60% marks in science stream");
        }else {
            System.out.println("student do not applicable for science stream");
        }

        //condition third-->0*1 = 0

        marks=50;
        stream="SCIENCE";

        if(marks>=60 && stream=="SCIENCE"){
            System.out.println("student got 60% marks in science stream");
        }else {
            System.out.println("student do not obtained cut of marks for science stream");
        }

        //condition fouth-->0*0 = 0

        marks=50;
        stream="MATHS";

        if(marks>=60 && stream=="SCIENCE"){
            System.out.println("student got 60% marks in science stream");
        }else {
            System.out.println("student do not obtained cut of marks for science stream");
        }

        //example2)code for to find eligible voter of UP

        //AND OPERATOR
        //Condition First--> 1*1 = 1

        int age=18;
        String city="UP";

        if(age>=18 && city=="UP"){
            System.out.println("candidate is eligible for vote in UP");
        }else {
            System.out.println("candidate is not eligible for vote in UP");
        }

        //condition second-->1*0 = 0

        age=19;
        city="DELHI";

        if(age>=18 && city=="UP"){
            System.out.println("candidate is eligible for vote in UP");
        }else {
            System.out.println("candidate is not eligible for vote in UP");
        }

        //condition third-->0*1 = 0

        age=16;
        city="UP";

        if(age>=18 && city=="UP"){
            System.out.println("candidate is eligible for vote in UP");
        }else {
            System.out.println("candidate is not eligible for vote in UP");
        }

        //condition fouth-->0*0 = 0

        age=14;
        city="DELHI";

        if(age>=18 && city=="UP"){
            System.out.println("candidate is eligible for vote in UP");
        }else {
            System.out.println("candidate is not eligible for vote in UP");
        }
    }
}

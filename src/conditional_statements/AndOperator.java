package conditional_statements;

public class AndOperator {

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
    }
}

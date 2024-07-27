package conditional_statements;

public class votingdemo {

    public static void main(String args []) {


        // SYNTAX : if(expression/condition){
        //           CODE   }

        int voting = +18;

        if (voting > 21) {
            System.out.println("Person is eligible for election" +voting);
        }

        if(voting < 18 ){
            System.out.println("Person is not eligible for election" +voting);
        }

    }

}

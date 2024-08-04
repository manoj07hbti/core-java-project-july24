package test_4_august;

public class Percentage {


    public static void main(String[] args) {


        int percentage = 58;
        if(percentage>=33 && percentage<60){
            System.out.println("SECOND DIVISION");
        } else{
            System.out.println("STUDENT IS FAILED");
        }


        percentage=70;

        if(percentage>=60 && percentage<75){
            System.out.println("STUDENT IS FIRST DIVISION");
        } else{
            System.out.println("STUDENT IS SECOND DIVISION");
        }


      percentage=75;

        if(percentage>=65 && percentage<80){
            System.out.println("STUDENT IS GOLD MEDELIST ");
        } else{
            System.out.println("STUDENT IS FIRST DIVISION");
        }
    }
}
